package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack3 {

    /*
    * Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
    */

    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int[] numbers = new int[10];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            int number = randomGenerator.nextInt(0, 100);
            numbers[i] = number;

            if(i % 2 != 0) {
                sum += number;
            }
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("The sum of the numbers in odd positions is: " + sum);
    }
}
