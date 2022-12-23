package butka.tarathep.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class BasicStatMethod {
    public static void main(String[] args) {
        String input = getInput();
        calculateStat(input);
    }

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number(separated by space:)");
        String nums = scanner.nextLine();
        scanner.close();
        return nums;
    }
    // get input from user

    public static void calculateStat(String nums) {
        String[] numAr = nums.split(" ");
        double[] numArdb = new double[numAr.length];
        if (nums != "") {
            for (int i = 0; i < numArdb.length; i++) {
                numArdb[i] = Double.parseDouble(numAr[i]);
            }
            // change string to double.
            Arrays.sort(numArdb);
            System.out.print("Sorted numbers are ");
            for (Double i : numArdb) {
                System.out.print(i + " ");
            }
            // sort numbers from least to greatest.
            System.out.print("\n");

            int dbArL = numArdb.length;
            double minimum = numArdb[0];
            double maximum = numArdb[0];
            double saverage = 0;
            double median = 0;
            double standarddeviation = 0;

            numArdb[0] = minimum;
            // set minimum

            maximum = numArdb[numArdb.length - 1];
            // set maximum

            for (int i = 0; i < dbArL; i++) {
                saverage += numArdb[i];
            }
            double average = saverage / numArdb.length;
            // calculate average.

            int i = numArdb.length / 2;
            if (dbArL % 2 == 0) {
                median = (numArdb[i - 1] + numArdb[i]) / 2;
            } else {
                median = numArdb[i];
            }
            // calculate and find median.

            for (double stddvt : numArdb) {
                standarddeviation += Math.pow(stddvt - average, 2);
            }
            standarddeviation = Math.sqrt(standarddeviation / numArdb.length);
            // calculate standard deviation.

            System.out.printf("Minimum: %.2f\n", minimum);
            System.out.printf("Maximum: %.2f\n", maximum);
            System.out.printf("Average: %.2f\n", average);
            System.out.printf("Median: %.2f\n", median);
            System.out.printf("Standard deviation: %.2f\n", standarddeviation);

        } else {
            System.out.println("Please enter at least one number.");
        }

    }

}
// This program will receive input from user and sort number and calculate
// minimum,maximum,average,median and standard deviation.
// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: December 22, 2022