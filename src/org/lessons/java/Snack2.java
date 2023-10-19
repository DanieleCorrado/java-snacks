package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack2 {
    /*
    * Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
    * e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
    *
    */

    public static void main(String[] args) {

        String[] name = {"Mario", "Franco", "Angelica", "Simone", "Sara", "Anna"};
        String[] surname = {"Rossi", "Bianchi", "Verdi", "Pinto", "Castano", "Rinaldi"};
        String[] guests = new String[6];

        Random randomGenerator = new Random();

        for (int i = 0; i < name.length; i++) {
            int randomName = randomGenerator.nextInt(0, name.length);
            int randomSurname = randomGenerator.nextInt(0, surname.length);
            guests[i] = name[randomName] + " " + surname [randomSurname];
        }

        System.out.println(Arrays.toString(guests));




    }
}
