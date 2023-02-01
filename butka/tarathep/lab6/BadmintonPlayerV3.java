package butka.tarathep.lab6;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 27, 2023

public class BadmintonPlayerV3 extends BadmintonPlayerV2 implements BadmintonPlayable, Spinter {
    // Declare instance variables to store the length of the racket, the world
    // ranking of the player,and player's speed.
    protected double racketLenght, speed;
    protected int worldRanking;

    // Constructor to initialize the instance variables of the superclass and this
    // class.
    public BadmintonPlayerV3(String name, double weight, double height, butka.tarathep.lab5.Athlete.Gender gender,
            String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    // Override toString method to return a string representation of the
    // BadmintonPlayerV3 object.
    @Override
    public String toString() {
        return super.toString() + "\n" + name + " is a Badminton player whose world ranking is " + worldRanking
                + " and has sprint speed as " + speed;
    }

    // Implement the getters and setters for the racket length of the player.
    @Override
    public double getRacketLength() {
        return racketLenght;

    }

    @Override
    public double setRacketLength(double racketLenght) {
        return this.racketLenght = racketLenght;

    }

    // Implement the getters and setters for the world ranking of the player.
    @Override
    public int getWorldRanking() {
        return worldRanking;

    }

    @Override
    public int setWorldRanking(int worldRanking) {
        return this.worldRanking = worldRanking;

    }

    // Implement the getters and setters for the player's speed.
    @Override
    public double getSpeed() {
        return speed;
    }

    public double setSpeed(double speed) {
        return this.speed = speed;

    }

}
