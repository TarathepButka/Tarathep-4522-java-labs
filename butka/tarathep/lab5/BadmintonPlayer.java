package butka.tarathep.lab5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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

    // The method to find athlete age and compere age. Example: athleteA is 17 year
    // older than athleteB.
    public void compareAge(Athlete athleteB) {
        LocalDate dateBefore = athleteB.birthDate2;
        LocalDate dateAfter = birthDate2;
        int year = (int) ChronoUnit.YEARS.between(dateBefore, dateAfter);

        if (year > 0) {
            System.out.println(athleteB.getName() + " is " + year + " year older than " + name);
        } else if (year == 0) {
            System.out.println(name + " is as old as " + athleteB.getName());
        } else {
            System.out.println(name + " is " + Math.abs(year) + " year older than " + athleteB.getName());
        }
    }

}
