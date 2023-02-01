package butka.tarathep.lab6;

import java.util.ArrayList;
import butka.tarathep.lab5.Athlete.Gender;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 23, 2023

public class WorldAthleteV3 {
    public static void main(String[] args) {
        ArrayList<AthleteV2> athletes = new ArrayList<AthleteV2>();
        BadmintonPlayerV2 ratchanok = new BadmintonPlayerV2("Ratchanok Intanon", 55.0, 1.68, Gender.FEMALE, "Thai",
                "05/02/1995");
        FootballerV2 tom = new FootballerV2("Tom Bardy", 102, 1.93, Gender.MALE, "American", "03/08/1977");
        BoxerV2 wisaksil = new BoxerV2("Wisaksil Wangek", 51.5, 1.60, Gender.MALE, "Thai", "08/12/1986");
        athletes.add(ratchanok);
        athletes.add(tom);
        athletes.add(wisaksil);

        for (AthleteV2 athlete : athletes) {
            System.out.println(athlete);
            athlete.practice();
        }
    }
}
