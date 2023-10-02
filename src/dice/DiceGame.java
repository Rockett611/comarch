package dice;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        int score = 0;
        int tempScore = 0;
        while (tempScore < 20) {
            int answer = option();
            if (answer == 1) {
                int rolled = roll();
                if (rolled == 1) {
                    System.out.println("straciłeś wszystkie punkty :(");
                    tempScore = 0;
                } else {
                    tempScore += rolled;
                    System.out.println("wyrzuciłeś " + rolled);
                    System.out.println("Twój wynik to " + tempScore);
                }

            } else if (answer == 0) {
                score = tempScore;
                tempScore = 0;
                System.out.println("Twój wynik to " + score);
                break;
            } else {
                System.out.println("wprowadź poprawną odpowiedź");
                answer = option();
            }
        }


    }

    public static int roll() {
        Random random = new Random();
        int diceThrow = random.nextInt(7);

        while (diceThrow == 0) {
            roll();
        }

        return diceThrow;
    }

    public static int option() {
        Scanner input = new Scanner(System.in);

        System.out.println("rzucamy (1) czy pas (0)?: ");

        try {
            int answer = input.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("musisz wprowadzić cyfrę 1 lub 0");
            option();
        }



//
//        try {
//            if (answer == 1) {
//                System.out.println("gramy");
//                return answer;
//            } else if (answer == 0) {
//                System.out.println("pas");
//                return answer;
//            } else {
//                System.out.println("podaj 1 albo 0");
//                option();
//            }
//        } catch (InputMismatchException ime) {
//            System.out.println("musisz wprowadzić cyfrę 1 lub 0");
//            option();
//        }
//        return answer;
    }
}
