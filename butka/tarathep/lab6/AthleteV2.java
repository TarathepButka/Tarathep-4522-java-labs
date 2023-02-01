package butka.tarathep.lab6;

import butka.tarathep.lab5.Athlete;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 23, 2023

// Class definition for AthleteV2, which extends the Athlete class
class AthleteV2 extends Athlete {

    // Constructor for AthleteV2
    public AthleteV2(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        // Call the superclass's constructor with the given parameters
        super(name, weight, height, gender, nationality, birthdate);
    }

    // Method to print the message about the athlete's practice
    public void practice() {
        System.out.print(name + " runs for 10 km");
    }

}
