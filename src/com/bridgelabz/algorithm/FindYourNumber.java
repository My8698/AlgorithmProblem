package com.bridgelabz.algorithm;
import java.util.Scanner;
public class FindYourNumber {
    public void findNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        /**
         * ask you to think to find number between 0 to N-1
         */
        System.out.println("Think a number in between range(0," +(number-1)+")");
        /**
         * answer should be in yes,low and high so we can found the number we want
         */
        System.out.println("Answer in yes, low, high");
        //initially low=0
        int low = 0;
        int high = number - 1;
        while (low <= high) {
            /**
             * to find middle
             */
            int middle = (low + high) / 2;
            System.out.println("Is your number " + middle + " ?");
            String input = scanner.nextLine();
            input = input.toLowerCase();
            if (input.equals("yes")) {
                System.out.println("Your number is " + middle);
                System.exit(0);
            } else if (input.equals("low")) {
                high = middle - 1;
            }
            else if(input.equals("high")) {
                low = middle + 1;
            }
        }
        System.out.println("Number not found");
        scanner.close();
    }
    public static void main(String[] args) {
        FindYourNumber findYourNumber = new FindYourNumber();
        findYourNumber.findNumber(100);
    }
}