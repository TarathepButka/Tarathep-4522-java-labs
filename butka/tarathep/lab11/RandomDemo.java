package butka.tarathep.lab11;

import java.util.Scanner;

import java.util.Random;
public class RandomDemo {
     public static void main(String[] args) {
           Random rand = new Random();
            for (int i = 0; i < 6; i++) {
              System.out.print((rand.nextInt(6) + 1) + " ");
           }
    }
}








