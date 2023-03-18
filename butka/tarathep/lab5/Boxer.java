package butka.tarathep.lab5;

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
    public Boxer(String name, double weight, double height, Gender gender, String nationality, String dob,
            String division, String golveSize) {
        super(name, weight, height, gender, nationality, dob);
        this.division = division;
        this.golveSize = golveSize;

    }

    // Return the message example <name>, <weight>kg, <height>m, <gender>,
    // <nationality>, <birthdate>, <sport>, <division>, <golveSize>
    public String toString() {
        return name + ", " + weight + "kg, " + height + "m, " + gender + ", " + nationality + ", "
                + dob + ", " + sport + ", " + division + ", " + golveSize;
    }

}
