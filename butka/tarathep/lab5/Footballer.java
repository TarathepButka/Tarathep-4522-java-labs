package butka.tarathep.lab5;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 15, 2022

//The Footballer class is extends from the Athlete class.
class Footballer extends Athlete {
    static String sport = "American Football";
    private String position, team;

    /**
     * The constructor takes in several parameters, including a player's name,
     * weight, height, gender, nationality, birthdate, position, and team.
     * The constructor then calls the parent class's constructor with the
     * same parameters, and assigns the position and team to the
     * corresponding class variables.
     */
    public Footballer(String name, double weight, double height, Gender gender, String nationality, String birthDate2,
            String position, String team) {
        super(name, weight, height, gender, nationality, birthDate2);
        this.position = position;
        this.team = team;
    }

    // Return the message example <name>, <weight>kg, <height>m, <gender>,
    // <nationality>, <birthdate>, <sport>, <position>, <team>
    public String toString() {
        return name + ", " + weight + "kg, " + height + "m, " + gender + ", " + nationality + ", "
                + birthDate2 + ", " + sport + ", " + position + ", " + team;
    }

}
