package butka.tarathep.lab5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 15, 2022

//The Boxer class is extends from the Athlete class.
class Boxer extends Athlete {
    static String sport = "Boxing";
    private String division, golveSize;

    /**
     * The constructor takes in several parameters, including a player's name,
     * weight, height, gender, nationality, birthdate, division, and golvesize.
     * The constructor then calls the parent class's constructor with the
     * same parameters, and assigns the division and golvesize to the
     * corresponding class variables.
     */
    public Boxer(String name, double weight, double height, Gender gender, String nationality, String birthDate2,
            String division, String golveSize) {
        super(name, weight, height, gender, nationality, birthDate2);
        this.division = division;
        this.golveSize = golveSize;

    }

    // Return the message example <name>, <weight>kg, <height>m, <gender>,
    // <nationality>, <birthdate>, <sport>, <division>, <golveSize>
    public String toString() {
        return name + ", " + weight + "kg, " + height + "m, " + gender + ", " + nationality + ", "
                + birthDate2 + ", " + sport + ", " + division + ", " + golveSize;
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
