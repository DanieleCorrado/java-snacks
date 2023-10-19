package org.lessons.java;

import java.util.Scanner;

public class Snack4 {

    // Data in input una stringa verificare se è palindroma

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();
        String wordCheck = word.replace(" ", "");

        boolean isPalindrome = true;
        for (int i = 0; i < wordCheck.length() / 2; i++) {
            if (wordCheck.charAt(i) != wordCheck.charAt(wordCheck.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The word " + word + " is a palindrome");
        } else {
            System.out.println("The word " + word + " is not a palindrome");
        }

        scanner.close();
    }
}
