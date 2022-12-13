package com.bridgelabz.algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String string1: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter the String string2: ");
        String string2 = scanner.nextLine();
        isAnagramString(string1,string2);
        scanner.close();
    }
    public static void isAnagramString(String string1,String string2) {
        boolean status=true;
        if(string1.length() != string2.length()) {
            status = false;
        }
        else {
            /**
             * 1)toLowerCase converts string into lower case
             * 2)toCharArray converts given string into sequence of character
             */
            char[] Array1 = string1.toLowerCase().toCharArray();
            char[] Array2 = string2.toLowerCase().toCharArray();
            /**
             * arrange elements of array
             */
            Arrays.sort(Array1);
            Arrays.sort(Array2);
            status = Arrays.equals(Array1, Array2);
        }
        if(status) {
            System.out.println("Both the Strings are Anagram");
        }
        else {
            System.out.println("The above Strings are not Anagram ");
        }
    }
}
