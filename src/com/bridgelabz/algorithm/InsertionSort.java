package com.bridgelabz.algorithm;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you would like to insert ? ");
        int noOfElements = scanner.nextInt();
        System.out.println("Total Size = " +noOfElements);
        String string[] = new String[noOfElements];
        System.out.println("Add the elements for sorting ");
        int array[] = new int[noOfElements];

        for(int i = 0; i < noOfElements; i++)
        {
            string[i] = scanner.next();
            array[i] = Integer.parseInt(string[i]);

        }
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array);

        insertionSort.displayArray(array);
        scanner.close();
    }
    /**
     * method to sort array
     */
    void sort(int array[])
    {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    /**
     * method to display array
     */
    void displayArray(int array[])
    {
        int number = array.length;
        System.out.println("\nElements after sorted are below \n");
        for (int i = 0; i < number; ++i)
            System.out.print(String.valueOf(array[i])+" ");
        System.out.println();
    }
}
