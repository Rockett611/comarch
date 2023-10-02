package dice;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        int score = 0;
        int tempScore = 0;
        while (tempScore < 30) {
            int answer = option();
            if (answer == 1) {
                int rolled = roll();
                if (rolled == 1) {
                    System.out.println("wyrzuciłeś " + rolled);
                    System.out.println("straciłeś wszystkie punkty :(");
                    tempScore = 0;
                } else if (rolled == 0) {
                    System.out.println("kość wypadła za stół, rzuć jeszcze raz");
                } else {
                    tempScore += rolled;
                    System.out.println("wyrzuciłeś " + rolled);
                    System.out.println("Twój wynik to " + tempScore);
                }

            } else if (answer == 0) {
                score = tempScore;
                System.out.println("Twój wynik to " + score);
                break;
            } else {
                System.out.println("wprowadź poprawną odpowiedź");
            }
        }


    }

    public static int roll() {
        Random random = new Random();
        int diceThrow = random.nextInt(7);

        if (diceThrow == 0) {
            roll();
        }

        return diceThrow;
    }

    public static int option() {
        Scanner input = new Scanner(System.in);

        System.out.println("rzucamy (1) czy pas (0)?: ");
        String answer = input.next();

        if (!answer.equals("1") && !answer.equals("0") && answer.isEmpty()) {
            System.out.println("wybierz opcję 1 lub 0");
            option();
        }

//        input.close();
        return Integer.valueOf(answer);
    }
}
