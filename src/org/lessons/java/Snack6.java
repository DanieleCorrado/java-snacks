package org.lessons.java;

import java.util.Scanner;

public class Snack6 {

    /*
    * Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi
    * e mostri a video la stringa generata (secondi → “hh:mm:ss”)
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the seconds: ");
        int seconds = scanner.nextInt();


        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = (seconds % 3600) % 60;

        String time = String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);

        // Stampa la stringa
        System.out.println("The time is: " + time);

        scanner.close();
    }
}
