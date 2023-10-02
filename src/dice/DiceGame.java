package dice;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        int score = 0;
        int tempScore = 0;
            while (tempScore < 20) {
                if (option() == 1) {
                    int rolled = roll();
                    if (rolled == 1) {
                        System.out.println("straciłeś wszystkie punkty :(");
                        tempScore = 0;
                        option();
                    } else {
                        tempScore += rolled;
                        System.out.println("wyrzuciłeś " + rolled);
                        System.out.println("Twój wynik to " + tempScore);
                        option();
                    }
                }
            }


    }

    public static int roll() {
        Random random = new Random();
        int diceThrow = random.nextInt();

        while (diceThrow == 0) {
            roll();
        }

        return diceThrow;
    }
    public static int option() {
        Scanner input = new Scanner(System.in);

        System.out.println("rzucamy (1) czy pas (0)?: ");
        int answer = input.nextInt();
        if (answer == 1) {
            System.out.println("gramy");

        } else if (answer == 0) {
            System.out.println("pas");

        } else {
            System.out.println("podaj 1 albo 0");
            option();
        }
        return answer;
    }
}
