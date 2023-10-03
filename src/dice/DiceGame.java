package dice;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        Player playerOne = new Player("Pedro");
        Player playerTwo = new Player("Zenon");

        boolean czyPlayerOne = true;

        System.out.println("zaczyna Player 1 - " + playerOne.getName());
        while ((playerOne.getTempScore() + playerOne.getScore()) < 30 &&
                (playerTwo.getTempScore() + playerTwo.getScore() <30)) {
            if (czyPlayerOne) {
                System.out.println("rzuca gracz " + playerOne.getName());
                playerOne.round();
            } else {
                System.out.println("rzuca gracz " + playerTwo.getName());
                playerTwo.round();
            }
            czyPlayerOne = !czyPlayerOne;
        }

    }

    public static int roll() {
        Random random = new Random();
        int diceThrow = random.nextInt(6) + 1;
        return diceThrow;
    }

    public static int option() {
        Scanner input = new Scanner(System.in);

        System.out.println("rzucamy (1) czy pas (0)?: ");
        String answer = input.next();

        if (!answer.equals("1") && !answer.equals("0")) {
            System.out.println("wybierz opcję 1 lub 0");
            return option();
        }

//        input.close();
        return Integer.valueOf(answer);
    }
}
