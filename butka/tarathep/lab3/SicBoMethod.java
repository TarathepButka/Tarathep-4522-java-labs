package butka.tarathep.lab3;

import java.util.Random;
import java.util.Scanner;

public class SicBoMethod {
    static int choice;

    public static void main(String[] args) {
        getChoice();
        playGame();
    }

    public static void getChoice() {
        Scanner scannergch = new Scanner(System.in);
        System.out.println("Choose how do you want to bet:");
        System.out.println("Type 1 for choosing high or low numbers.");
        System.out.println("Type 2 for choosing number between 1-6.");
        System.out.print("Enter your choice:");
        choice = scannergch.nextInt();

    }
    // get type and what user want to bet.

    public static void playGame() {
        Scanner scannerpg = new Scanner(System.in);

        if (choice == 1) {
            System.out.print("Type in h for high or l for low: ");
            String types = scannerpg.next();
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
                    // check condition h,H if total >= 11 && total <= 18 display "You win 20 Baht".
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
            int num = scannerpg.nextInt();
            int dice1 = 1 + (int) (Math.random() * ((6 - 1) + 1));
            int dice2 = 1 + (int) (Math.random() * ((6 - 1) + 1));
            int dice3 = 1 + (int) (Math.random() * ((6 - 1) + 1));
            if (num >= 1 && num <= 6) {
                System.out.println("Dice 1 :" + " " + dice1 + " " + "Dice 2 :" + dice2 + " " + "Dice 3 :" + dice3);
                if (num == dice1 && num == dice2 && num == dice3) {
                    System.out.println("You win 90 Baht");
                } else if (num == dice1 && num == dice3 || num == dice1 && num == dice2
                        || num == dice2 && num == dice3) {
                    System.out.println("You win 60 Baht");
                } else if (num == dice1 || num == dice2 || num == dice3) {
                    System.out.println("You win 30 Baht");
                } else {
                    System.out.println("You loose 10 Baht");
                }
                // get input random number and check condition.

            } else {
                System.out.println("Incorrect input. Enter a number between 1-6 only.");
                // show display if user not input 1-6.
            }

        } else {
            System.out.println("Incorrect input. Enter 1 or 2 only.");
            // show display if user not input 1-2.
        }
        scannerpg.close();

    }

}
// This program will get type and what user want to bet then check condition.
// To find out lose or win.
// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: December 21, 2022