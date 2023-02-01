package butka.tarathep.lab6;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 23, 2023

// Class definition for FootballerV2, which extends the AthleteV2 class
class FootballerV2 extends AthleteV2 {
    // Constructor for FootballerV2
    public FootballerV2(String name, double weight, double height, Gender gender,
            String nationality, String birthdate) {
        // Call the superclass's constructor with the given parameters
        super(name, weight, height, gender, nationality, birthdate);
    }

    // Override the practice method from the AthleteV2 class
    @Override
    public void practice() {
        super.practice();
        System.out.println(" and catches a football");
    }

}
