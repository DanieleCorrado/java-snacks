package org.lessons.java;

import java.util.Scanner;

public class Snack1 {

    /* Continua a chiedere all’utente di inserire un numero, se è pari stampa il numero,
    se è dispari stampa il numero successivo. Se il numero è negativo termina.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userNumber = 0;

        while (userNumber >= 0) {

            System.out.print("Enter the number (>0): ");
            userNumber = Integer.parseInt(scanner.nextLine());

            if(userNumber >=0) {

                if(userNumber % 2 == 0) {
                    System.out.println("The number is: " + userNumber);
                } else {
                    System.out.println("The next number is: " + (userNumber + 1));
                }
            } else{
                System.out.println("The number entered is less than zero, the program will be terminated");
            }
        }

        scanner.close();
    }
}
