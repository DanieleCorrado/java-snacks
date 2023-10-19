package org.lessons.java;

import java.util.Scanner;

public class Snack5 {

    /*
    * Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
    * Possibile usare solo:
    * cicli
    * chartAt
    * if / switch
    * Es. “25" come stringa deve essere convertito in intero 25.
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numberString = scanner.nextLine();

        int integer = 0;
        boolean isValid = true;
        for (int i = 0; i < numberString.length(); i++) {
            char c = numberString.charAt(i);
            int digit = Character.getNumericValue(c);

            if (digit < 0 || digit > 9) {
                isValid = false;
                break;
            }
            integer *= 10;
            integer += digit;
        }

        if (isValid) {
            System.out.println("The string entered is the number: " + integer);
        } else {
            System.out.println("The string " + numberString + " is not a valid number");
        }

        scanner.close();
    }
}
