package butka.tarathep.lab2;

public class Footballer {
    public static void main(String[] args) {
        int numArguments = args.length;
        if (numArguments != 3){
        System.out.println("Usage Footballer <footballer name> <nationality> <football club>");
        System.exit(0);
        //This Footballer program is to accept three arguments
    }
    String name = args[0];
    String nationality = args[1];
    String club = args[2];

    System.out.println("My favorite football player is "+ name);
    System.out.println("His nationality is "+ nationality);
    System.out.println("He plays for "+ club);
    //Its output format is
    //My Favorite football player  is <athlete_name>.  
    //His nationality as <athlete_nationality>
    //He plays for <his football club>” 

    }
}
//Author: Tarathep Butka
//ID: 653040452-2
// Sec: 1
// Date: December 9, 2022

