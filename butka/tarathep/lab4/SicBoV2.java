package butka.tarathep.lab4;

import java.util.Scanner;

/**
 * The program ask which game user want to play.
 * How do they want to bet, then how much do they win.
 * </p>
 * When this process end,
 * SicBoV2 will ask the user if they want to keep playing.
 * </p>
 * If a user input "a" or "A" the game will start again. If user input anything
 * else, the game will stop.
 * 
 * @author Tarathep Butka
 * @version 1.0 5/1/2023
 */

public class SicBoV2 {
    static int choice;
    static String dicisions;
    static String myname = "ธราเทพ บุตกะ";
    static String myID = "(653040452-2)";
    static Scanner myScanner = new Scanner(System.in);
    static String[] id = myID.split("");
    static int digitid = Integer.parseInt(id[id.length - 2]);

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
    }

    /**
     * This method add choice from user.
     * 
     * @param choice is integer to choose type of game.
     */
    public static void getChoice() {
        System.out.println("Welcome to " + myname + " " + myID + " Game:");
        System.out.println("Type 1 for choosing high or low numbers.");
        System.out.println("Type 2 for choosing number between 1-6.");
        System.out.print("Enter your choice:");
        choice = myScanner.nextInt();

    }

    /**
     * This method add what user bet and check condition and display user win or
     * lose.
     * </p>
     * Example user bet is h,H,l,L,1,2,3,4,5,6.
     * 
     * @param types is a string to choose type you bet and find game result.
     * @param num   is a integer to find result of game.
     */
    public static void playGame() {
        if (choice == 1) {
            System.out.print("Type in h for high or l for low: ");
            String types = myScanner.next();
            int dice1 = 1 + (int) (Math.random() * ((6 - 1) + 1));
            int dice2 = 1 + (int) (Math.random() * ((6 - 1) + 1));
            int dice3 = 1 + (int) (Math.random() * ((6 - 1) + 1));
            int total = dice1 + dice2 + dice3;
            // condition 1 random number and plus number.

            if (types.equalsIgnoreCase("l")) {
                System.out.println("Dice 1 :" + " " + dice1 + " " + "Dice 2 :" + dice2 + " " + "Dice 3 :" + dice3);
                System.out.println("Total is " + total);
                if (total >= 3 && total <= 10) {
                    System.out.println("You win 20 Baht");
                    // check condition l,L if total >= 3 && total <= 10 display "You win 20 Baht".
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
            System.out.print("Type ia a number to bet on (1-6): ");
            int num = myScanner.nextInt();
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

            } else {
                System.out.println("Incorrect input. Enter a number between 1-6 only.");
                // show display if user not input 1-6.
            }

        } else {
            System.out.println("Incorrect input. Enter 1 or 2 only.");
            // show display if user not input 1-2.
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
        dicisions = myScanner.next();
        // Ask if you want to continue or end this game.

    }
}
