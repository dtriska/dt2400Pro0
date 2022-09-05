//Derek
//CS 1400
//Project 1
package project1lab2.pkg2.pkg2;

import java.util.Scanner;

public class Project1Lab222 {


    public static void main(String[] args) {
        System.out.println("Enter a line to see if it is a palindrome. Enter a blank line to end the test.");
        int totalPalindromes = 0;
        String line = " ";
        Scanner scnr = new Scanner(System.in);  
        do {
            System.out.print("Enter: ");
            line = scnr.nextLine();
            if (line.length() > 0) {
                line = line.toLowerCase();
                int first = 0;
                int last = line.length() - 1;
                boolean falsePalindrome = false;
                while (first < last) {
                    while (!Character.isLetter(line.charAt(first))) {
                        first += 1;
                    }
                    while (!Character.isLetter(line.charAt(last))) {
                        last -= 1;
                    }
                    if (line.charAt(first) != line.charAt(last)) {
                        falsePalindrome = true;
                        break;
                    }
                    first += 1;
                    last -= 1;
                }
                if (!falsePalindrome) {
                    totalPalindromes += 1;
                } 
            }
        } while (line.length() > 0);
        System.out.println("Total Palindromes: " + totalPalindromes);
    }
//first comment
}
