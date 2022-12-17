package com.bridgelabz.algorithm;
import java.util.Arrays;
import java.util.Scanner;
/***
 *program to find word in given word list
 */
public class SearchWord{
    public static void main(String[] args) {

        String paragraph = "Binary search is used to search key element from multiple elements";
        /**
         * returns total number of words in a string excluding space only
         */
        String[] array = paragraph.toLowerCase().split(" ");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String word = input.next();

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "-->" + array[i] + " ");
        }
        System.out.println();
        /**
         * binary search to search key element from multiple elements
         */
        if (Arrays.binarySearch(array, word) >= 0) {
            System.out.println(word + " is contain in the word list");
        } else {
            System.out.println(word + " is not contain in the word list");
        }
    }
}
