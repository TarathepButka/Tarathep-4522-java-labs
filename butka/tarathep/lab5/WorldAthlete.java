package butka.tarathep.lab5;

//The program will 
// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 15, 2022

import butka.tarathep.lab5.Athlete.Gender;

/**
 * This is the main method of a class called "WorldAthlete", which creates 3
 * Athlete objects, one for each "Ratchanok Intanon", "Wisaksil Wangek", and
 * "Tom Brady" respectively.
 * 
 * It initializes each Athlete object with their respective name, weight,
 * height, gender, nationality, and birthdate.
 * 
 * It then calls the getName() and getHeight() methods to display the name and
 * height of Ratchanok Intanon.
 * 
 * It then calls the setHeight() method to set Ratchanok Intanon's height
 * to 1.70 and then again calls the getHeight() method to display the updated
 * height.
 * 
 * It uses the toString() method to print the entire Athlete objects.
 */
public class WorldAthlete {
    public static void main(String[] args) {
        Athlete ratchanok = new Athlete("Ratchanok Intanon", 55, 1.68, Gender.FEMALE, "Thai", "05/12/1995");
        Athlete wisaksil = new Athlete("Wisaksil Wangek", 51.5, 1.60, Gender.MALE, "Thai", "03/08/1986");
        Athlete tom = new Athlete("Tom Brady", 102, 1.93, Gender.MALE, "American", "03/08/1977");
        System.out.println(ratchanok.getName() + "'s height is " + ratchanok.getHeight());
        ratchanok.setHeight(1.70);
        System.out.println(ratchanok.getName() + "'s height has increaded to " + ratchanok.getHeight());
        System.out.println(ratchanok);
        System.out.println(wisaksil);
        System.out.println(tom);
    }
}
/**
 * The exam output is about
 * Ratchanok Intanon's height is 1.68
 * Ratchanok Intanon's height has increaded to 1.7
 * Athlete [Ratchanok Intanon, 55.0kg, 1.7m, FEMALE, Thai, 1995-12-05]
 * Athlete [Wisaksil Wangek, 51.5kg, 1.6m, MALE, Thai, 1986-08-03]
 * Athlete [Tom Brady, 102.0kg, 1.93m, MALE, American, 1977-08-03]
 */
