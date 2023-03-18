package butka.tarathep.lab5;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 15, 2022

public class Athlete  implements Serializable{
    // protected instance variables
    protected String name, nationality, birthdate = "01/01/0001";
    protected double weight, height;
    protected Gender gender;
    protected LocalDate dob;

    // Enum for gender
    public enum Gender {
        MALE, FEMALE
    }

    /**
     * The constructor takes in several parameters including a player's name,
     * weight, height, gender, nationality, and birthdate.
     * 
     * It assigns the value of these parameters to the corresponding class
     * variables, such as name, weight, height, gender, nationality, and birthdate.
     */
    public Athlete(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.nationality = nationality;
        this.birthdate = birthdate;
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dob = LocalDate.parse(birthdate, formater);
    }

    // the method use to get name.
    public String getName() {
        return name;
    }

    // this method is for the value of the name variable reconfiguration.
    public void setName(String name) {
        this.name = name;
    }

    // the method use to get weight.
    public double getWeight() {
        return weight;
    }

    // this method is for the value of the weight variable reconfiguration.
    public void setWeight(int weight) {
        this.weight = weight;
    }

    // the method use to get height.
    public double getHeight() {
        return height;
    }

    // this method is for the value of the height variable reconfiguration.
    public void setHeight(double height) {
        this.height = height;
    }

    // the method use to get nationality.
    public String getNationality() {
        return nationality;
    }

    // this method is for the value of the nationality variable reconfiguration.
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // the method use to get birthdate.
    public LocalDate getBirthdate() {
        return dob;
    }

    // this method is for the value of the birthdate variable reconfiguration.
    public void setBirthdate(LocalDate birthDate2) {
        this.dob = dob;
    }

    // Return the message example Athlete [<name>, <weight>kg, <height>m, <gender>,
    // <nationality>, <birthdate>].
    public String toString() {
        return "Athlete " + "[" + name + ", " + weight + "kg, " + height + "m, " + gender + ", " + nationality + ", "
                + dob + "]";

    }

    // The method to find athlete age and compere age. Example: athleteA is 17 year
    // older than athleteB.
    public void compareAge(Athlete athleteB) {
        LocalDate dateBefore = athleteB.dob;
        LocalDate dateAfter = dob;
        int year = (int) ChronoUnit.YEARS.between(dateBefore, dateAfter);

        if (year > 0) {
            System.out.println(athleteB.getName() + " is " + year + " years older than " + name);
        } else if (year == 0) {
            System.out.println(name + " is as old as " + athleteB.getName());
        } else if (year < 0) {
            System.out.println(athleteB.getName() + " is " + -year + " years younger than " + name);
        }
    }
}
