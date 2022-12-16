package com.bridgelabz.algorithm;

import java.util.ArrayList;
public class BinarySearch {
    /***
     *Binary search program to find elemet at specific index
     */
    int binarySearch(ArrayList<Integer> array, int x) {
        int left = 0, right = array.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            /**
             *Check if x is present at mid
             */
            if (array.get(mid) == x)
                return mid;
            /**
             *  If x greater than mid element then ignore left half
             */
            if (array.get(mid) < x)
                left = mid + 1;
            /**
             * If x is smaller than mid element then ignore right half
             */
            else
                right = mid - 1;
        }
        /**
         * if we reach here, then element
         *  not found
         */
        return -1;
    }
    public static void main(String args[]) {
        BinarySearch object = new BinarySearch();

        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(5);
        array.add(10);
        array.add(15);
        array.add(20);
        array.add(25);
        array.add(30);
        array.add(35);

        int x = 30;

        /**
         * Printing elements of array list
         */
        System.out.println("The elements of the arraylist are: " + array);

        int result = object.binarySearch(array, x);

        if (result == -1)
            System.out.println("Element not found");

        else
            System.out.println("The Element " + x + " is found at " + "index " + result);
    }
}