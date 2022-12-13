package com.bridgelabz.algorithm;
import java.util.Scanner;
public class PrimeInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int first_Number = scanner.nextInt();
        System.out.println("Enter second number : ");
        int second_Number = scanner.nextInt();
        primeInRange(first_Number,second_Number);
        scanner.close();
    }
    public static void primeInRange(int a,int b) {
        for(int i = a;i <= b;i++) {
            if(i == 1 || i == 0 ) continue;
            int flag = 0;
            for(int j = 2;j <= i/2;j++) {
                if(i%j == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
