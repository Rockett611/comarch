package dice;

public class Player {

    private int tempScore = 0;
    private int score = 0;
    private String name;

    // const
    public Player(String name) {
        this.name = name;
    }

    public void round() {
        int answer = 0;
        while (tempScore < 30 && (score + tempScore) < 30) {
            answer = DiceGame.option();
            if (answer == 1) {
                int rolled = DiceGame.roll();
                if (rolled == 1) {
                    System.out.println("wyrzuciłeś " + rolled);
                    System.out.println("straciłeś wszystkie punkty");
                    tempScore = 0;
                    break;
                } else {
                    tempScore += rolled;
                    System.out.println("wyrzuciłeś " + rolled);
                    System.out.println("Twój wynik to " + (tempScore + score));
                }
            } else if (answer == 0) {
                score += tempScore;
                tempScore = 0;
                System.out.println("Twój wynik to " + score);
                break;
            } else {
                System.out.println("wprowadź poprawną odpowiedź");
            }
        }
    }

    //setters
    public void setTempScore(int tempScore) {
        this.tempScore = tempScore;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //getters
    public int getTempScore() {
        return tempScore;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }


}