package tamagoczi;

import java.util.Random;

public class Creature {


    private int healthLevel;
    private int foodLevel;
    private int moodLevel;
    private String name;

// constructor
    public Creature() {
        this.name = "";
        setInitialStats();
    }

// actions
    public void play() {
        System.out.printf("%s jest znudzony, pobawcie się\n", name);
        moodLevel += 20;
        foodLevel -= 20;
        healthLevel -= 5;
    }

    public void sleep() {
        System.out.printf("%s jest śpiący, czas na spanie\n", name);
        moodLevel -= 10;
        foodLevel -= 25;
        healthLevel += 25;
    }

    public void eat() {
        System.out.printf("%s jest głodny, daj jeść\n", name);
        moodLevel -= 5;
        foodLevel += 30;
        healthLevel += 5;
    }

    private void setInitialStats() {
        Random random = new Random();
        foodLevel = random.nextInt(100)+1;
        healthLevel = random.nextInt(100)+1;
        moodLevel = random.nextInt(100)+1;
    }

    public void printCreatureStats() {
        System.out.printf("obecny stan %s to:\nzdrowie: %d\nnajedzenie: %d\nnastrój: %d\n",
                name,
                healthLevel,
                foodLevel,
                moodLevel);
    }

// get
    public String getName() {
        return name;
    }

// set
    public void setName(String name) {
        this.name = name;
    }
}
