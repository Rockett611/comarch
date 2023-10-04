package tamagoczi;

import java.util.Scanner;

public class GameLogic {

    private Creature stworek;


    Scanner scan = new Scanner(System.in);

    public GameLogic() {
        stworek = new Creature();
    }

    public void runGame() {
        System.out.println("postanowiłeś przygarnąć stworka");
        stworek.setName(getCreatureName());
        stworek.printCreatureStats();
        for (int i = 0; i < 3; i++) {
            executionOfActivities();

        }
    }

    private String getCreatureName() {
        System.out.println("jak nazywa się Twój stworek?");
        return scan.next();
    }

    private int selectActivities() {
        System.out.println("co chcesz zrobić?");
        System.out.println("1. bawić się");
        System.out.println("2. nakarm");
        System.out.println("3. połóż spać");
        return scan.nextInt();
    }

    private void executionOfActivities() {
        int activity = selectActivities();
        if (activity == 1) {
            stworek.play();
        } else if (activity == 2) {
            stworek.eat();
        } else {
            stworek.sleep();
        }
        stworek.printCreatureStats();
    }
}
