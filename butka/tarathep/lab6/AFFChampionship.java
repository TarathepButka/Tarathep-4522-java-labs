package butka.tarathep.lab6;

import java.util.ArrayList;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 25, 2023

// Class definition for AFFChampionship, which extends Competition
public class AFFChampionship extends Competition {
    // Instance variables for teamA, teamB and places.
    protected String teamA, teamB, places;

    // Constructor to initialize the instance variables
    public AFFChampionship(String name, String teamA, String teamB) {
        // Call the super class constructor to initialize name and region
        super(name);
        this.teamA = teamA;
        this.teamB = teamB;
    }

    @Override
    public void setDescription() {

    }

    @Override
    // Method to set the sponsorship of the competition
    public void setSponsorship(ArrayList<String> sponsors) {
        if (sponsors.size() > 1) {
            System.out.println("Sponsors of " + name + " are " + sponsors);
        } else {
            System.out.println(sponsors.get(0) + " is a sponsor of " + name);
        }

    }

    // Method to set the place of the competition
    public void setPlaces(ArrayList<String> places) {
        System.out.println(name + " plays at these stadiums" + "\n" + places);
    }

    // Method to return a string representation of the AFFChampionship object
    public String toString() {
        return name + " in the final round was the game between " + teamA + " vs. " + teamB + ".";
    }

}
