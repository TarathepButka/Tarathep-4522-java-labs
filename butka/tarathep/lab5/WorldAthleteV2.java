package butka.tarathep.lab5;

import butka.tarathep.lab5.Athlete.Gender;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 15, 2022

/**
 * This is the main method of a class creates 3 objects of type BadmintonPlayer,
 * Footballer, and Boxer respectively.
 * 
 * It initializes each object with their respective name, weight, height,
 * gender, nationality, birthdate, racket length and world ranking, position and
 * team, and weight class and division respectively.
 * 
 * It calls the toString() method to print the entire BadmintonPlayer,
 * Footballer, and Boxer objects.
 * 
 * It creates an object of type BadmintonPlayer named "Nitchaon Jindapol"
 * and print that both Ratchanok and Nitchaon play Badminton, which is the sport
 * of the BadmintonPlayer class.
 * 
 * It calls the compareAge method to compare the age of Ratchanok and Tom,
 * and Ratchanok and Nitchaon.
 * 
 * It calls the isTaller method which compare height of Wisaksil and
 * Tom and returns Wisaksil is taller than Tom or not, and prints the
 * result.
 */
public class WorldAthleteV2 {
    public static void main(String[] args) {
        BadmintonPlayer ratchanok = new BadmintonPlayer("Ratchanok Intanon", 55, 1.68, Gender.FEMALE, "Thai",
                "05/02/1995", 66.5, 4);
        Footballer tom = new Footballer("Tom Brady", 102, 1.93, Gender.MALE, "American", "03/08/1977", "Quarterback",
                "New England Patriots");
        Boxer wisaksil = new Boxer("Wisaksil Wangek", 51.5, 1.60, Gender.MALE, "Thai", "08/12/1986", "Super Flyweight",
                "M");
        System.out.println(ratchanok);
        System.out.println(wisaksil);
        System.out.println(tom);
        BadmintonPlayer nitchaon = new BadmintonPlayer("Nitchaon Jindapol", 52, 1.63, Gender.FEMALE, "Thailand",
                "31/03/1991", 67, 11);
        System.out.println(
                "Both " + ratchanok.getName() + " and " + nitchaon.getName() + " play " + BadmintonPlayer.getSport());
        ratchanok.compareAge(tom);
        ratchanok.compareAge(nitchaon);

        if (isTaller(wisaksil, tom)) {
            System.out.println(wisaksil.getName() + " is taller than " + tom.getName());
        } else {
            System.out.println(wisaksil.getName() + " is not taller than " + tom.getName());

        }

    }

    // the method to compare athlete height and return.
    static boolean isTaller(Athlete athleteA, Athlete athleteB) {
        if (athleteA.height > athleteB.height) {
            return true;
        } else {
            return false;
        }

    }

}

/**
 * The exam output is about
 * Ratchanok Intanon, 55.0kg, 1.68m, FEMALE, Thai, 1995-02-05, Badminton,
 * 66.5cm, rank:4
 * Wisaksil Wangek, 51.5kg, 1.6m, MALE, Thai, 1986-12-08, Boxing, Super
 * Flyweight, M
 * Tom Brady, 102.0kg, 1.93m, MALE, American, 1977-08-03, American Football,
 * Quarterback, New England Patriots
 * Both Ratchanok Intanon and Nitchaon Jindapol play Badminton
 * Tom Brady is 17 year older than Ratchanok Intanon
 * Nitchaon Jindapol is 3 year older than Ratchanok Intanon
 * Tom Brady is taller than Wisaksil Wangek
 */