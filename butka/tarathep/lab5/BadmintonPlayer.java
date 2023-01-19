package butka.tarathep.lab5;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 15, 2022

//The BadmintonPlayer class is extends from the Athlete class.
class BadmintonPlayer extends Athlete {
    static String sport = "Badminton";
    private double racketLenght;
    private int worldRanking;

    /**
     * The constructor takes in several parameters, including a player's name,
     * weight, height, gender, nationality, birthdate, racket length, and world
     * ranking. The constructor then calls the parent class's constructor with the
     * same parameters, and assigns the racket length and world ranking to the
     * corresponding class variables.
     */
    public BadmintonPlayer(String name, double weight, double height, Gender gender, String nationality,
            String birthDate2, double racketLenght, int worldRanking) {
        super(name, weight, height, gender, nationality, birthDate2);
        this.racketLenght = racketLenght;
        this.worldRanking = worldRanking;
    }

    // Return the message example <name>, <weight>kg, <height>m, <gender>,
    // <nationality>, <birthdate>, <sport>, <racketLenght>cm, rank:<worldRanking>
    public String toString() {
        return name + ", " + weight + "kg, " + height + "m, " + gender + ", " + nationality + ", "
                + birthDate2 + ", " + sport + ", " + racketLenght + "cm, " + "rank:" + worldRanking;
    }

    // the method for get sport
    public static String getSport() {
        return sport;
    }

}
