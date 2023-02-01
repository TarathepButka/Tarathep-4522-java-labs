package butka.tarathep.lab6;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 25, 2023

import java.util.ArrayList;

// Class definition for Competition, which is an abstract class
abstract class Competition {
    // Instance variables for name and region of the competition
    protected String name, region;

    // Constructor for Competition
    public Competition(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for region
    public String getRegion() {
        return region;
    }

    // Setter method for region
    public void setRegion(String region) {
        this.region = region;
    }

    // setDescription is a space method following by lab6 sheet.
    public abstract void setDescription();

    // Method to set sponsorship of the competition
    public abstract void setSponsorship(ArrayList<String> sponsors);

}
