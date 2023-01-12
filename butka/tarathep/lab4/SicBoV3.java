package butka.tarathep.lab4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The program ask which game user want to play.
 * How do they want to bet, then how much do they win. When this process end,
 * SicBoV2 will ask the user if they want to keep playing.
 * </p>
 * If a user input "a" or "A" the game will start again. If user input anything
 * else, the game will stop.SicBoV3 add the conditions if user input anything
 * else other than "1" and "2"
 * </p>
 * when choosing game, "h", "H", "l", "L" in game 1
 * and 1 - 6 in game 2. The program will continue asking user to input until
 * user input the correct input.
 * 
 * @author Tarathep Butka
 * @version 1.0 7/1/2023
 */

public class SicBoV3 {
    static int choice;
    static String dicisions;
    static String myname = "ธราเทพ บุตกะ";
    static String myID = "(653040452-2)";
    static Scanner myScanner = new Scanner(System.in);
    static String[] id = myID.split("");
    static int digitid = Integer.parseInt(id[id.length - 2]);
    static int num;
    static String numSt;

    /**
     * The main method of the program.
     * </p>
     * running method are :
     * <ul>
     * </p>
     * <li>getChoice();
     * </ul>
     * <ul>
     * </p>
     * <li>playGame();
     * </ul>
     * <ul>
     * </p>
     * <li>dicision();
     * </ul>
     * 
     * @param args Program arguments
     */

    public static void main(String[] args) {
        getChoice();
        playGame();
        dicision();
        while (dicisions.equalsIgnoreCase("A")) {
            getChoice();
            playGame();
            dicision();
        }
        {
            System.out.println("Good Bye!");
        }
        myScanner.close();
    }

    /**
     * This method add choice from user and check if choice !=1or2 method will get
     * user to press agian.
     * 
     * @param choice is integer to choose type of game.
     */
    public static void getChoice() {
        while (true) {
            System.out.println("Welcome to " + myname + " " + myID + " Game:");
            System.out.println("Type 1 for choosing high or low numbers.");
            System.out.println("Type 2 for choosing number between 1-6.");
            System.out.print("Enter your choice:");
            try {
                choice = myScanner.nextInt();
            } catch (InputMismatchException e) {
                // show display if user not input 1-2.
                System.out.println("Enter 1 or 2 only:");
                myScanner.nextLine();
                getChoice();
                return;
            }
            if (choice == 1 || choice == 2) {
                break;
            }
        }
    }

    /**
     * This method add what user bet and check condition and display user win or
     * lose.
     * </p>
     * Example user bet is h,H,l,L,1,2,3,4,5,6.if user bet isn't h,H,l,L,1,2,3,4,5,6
     * the method will give user bet again.
     * 
     * @param types is a string to choose type you bet and find game result.
     * @param numSt is a string to check if numSt !=1-6 user will bet again.
     * @param num   is a integer to find result of game.
     * 
     */
    public static void playGame() {
        if (choice == 1) {
            String types;
            int dice1 = 1 + (int) (Math.random() * ((6 - 1) + 1));
            int dice2 = 1 + (int) (Math.random() * ((6 - 1) + 1));
            int dice3 = 1 + (int) (Math.random() * ((6 - 1) + 1));
            int total = dice1 + dice2 + dice3;// condition 1 random number and plus number.
            /*
             * if user bet isn't h,H,l,L,1,2,3,4,5,6
             * it will get user bet again.
             */
            do {
                System.out.print("Type in h for high or l for low: ");
                types = myScanner.next();
                if (!(types.equalsIgnoreCase("l")) && !(types.equalsIgnoreCase("h"))) {
                    System.out.println("Incorrect input. Enter h for high and l for low only.");
                }
            } while (!(types.equalsIgnoreCase("l")) && !(types.equalsIgnoreCase("h")));

            if (types.equalsIgnoreCase("l")) {
                System.out.println("Dice 1 :" + " " + dice1 + " " + "Dice 2 :" + dice2 + " " + "Dice 3 :" + dice3);
                System.out.println("Total is " + total);
                if (total >= 3 && total <= 10) {
                    // check condition l,L if total >= 3 && total <= 10 display "You win 20 Baht".
                    System.out.println("You win 20 Baht");
                } else {
                    System.out.println("You loose 10 Baht");
                    // if total<11 display "You loose 10 Baht".
                }
            } else if (types.equalsIgnoreCase("h")) {
                System.out.println("Dice 1 :" + " " + dice1 + " " + "Dice 2 :" + dice2 + " " + "Dice 3 :" + dice3);
                System.out.println("Total is " + total);
                if (total >= 11 && total <= 18) {
                    System.out.println("You win 20 Baht");
                    // check condition h,H if total >= 11 && total <= 18 display "You win 20 Baht".
                } else {
                    System.out.println("You loose 10 Baht");
                    // if total<11 display "You loose 10 Baht".
                }
            } else {
                System.out.println("Incorrect input. Enter h for high and l for low only.");
                // show display if user not input l,L,h,H.
            }

        } else if (choice == 2) {
            // check if user not bet 1-6 progarm will get input again.
            do {
                System.out.print("Type ia a number to bet on (1-6): ");
                myScanner.nextLine();
                numSt = myScanner.next();
                if (!(numSt.equalsIgnoreCase("1")) && !(numSt.equalsIgnoreCase("2")) && !(numSt.equalsIgnoreCase("3"))
                        && !(numSt.equalsIgnoreCase("4")) && !(numSt.equalsIgnoreCase("5"))
                        && !(numSt.equalsIgnoreCase("6"))) {
                    System.out.println("Incorrect input. Enter a number between 1-6 only.");
                }
            } while (!(numSt.equalsIgnoreCase("1")) && !(numSt.equalsIgnoreCase("2")) && !(numSt.equalsIgnoreCase("3"))
                    && !(numSt.equalsIgnoreCase("4")) && !(numSt.equalsIgnoreCase("5"))
                    && !(numSt.equalsIgnoreCase("6")));

            num = Integer.parseInt(numSt);// change numSt to num int
            if (num >= 1 && num <= 6) {
                int dice1 = 1 + (int) (Math.random() * ((6 - 1) + 1));
                int dice2 = 1 + (int) (Math.random() * ((6 - 1) + 1));
                int dice3 = 1 + (int) (Math.random() * ((6 - 1) + 1));
                if (num >= 1 && num <= 6) {
                    System.out.println("Dice 1 :" + " " + dice1 + " " + "Dice 2 :" + dice2 + " " + "Dice 3 :" + dice3);
                    if (num == dice1 && num == dice2 && num == dice3) {
                        System.out.println("You win " + (10 * 3 * (digitid % 6)) + " Baht");
                    } else if (num == dice1 && num == dice3 || num == dice1 && num == dice2
                            || num == dice2 && num == dice3) {
                        System.out.println("You win " + (10 * 2 * (digitid % 6)) + " Baht");
                    } else if (num == dice1 || num == dice2 || num == dice3) {
                        System.out.println("You win " + (10 * 1 * (digitid % 6)) + " Baht");
                    } else {
                        System.out.println("You loose 10 Baht");
                    }

                    // get input random number and check condition.
                    // if win display you win
                    // (10*3*(digitid%6)) baht. match3 dice
                    // (10*2*(digitid%6)) baht. match2 dice
                    // (10*1*(digitid%6)) baht. match1 dice

                }
            }

        }

    }

    /**
     * This method is ask if user want to play again or end game.
     * </p>
     * If user want to play again press a,A.
     * </p>
     * If user want to end press the other keys.
     * 
     * @param dicisions is a string to play game again or exit game.
     */
    public static void dicision() {
        System.out.println("Press A to play again. Press the other keys to exit.");
        myScanner.nextLine();
        dicisions = myScanner.next();
        // Ask if you want to continue or end this game.

    }

}
