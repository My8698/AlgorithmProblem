package com.bridgelabz.algorithm;
import java.util.Scanner;
public class Calendar
{
    public static int day(int month, int day, int year)
    {
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31*m)/12) % 7;
        return d;
    }
    public static boolean isLeapYear(int year)
    {
        if  ((year % 4 == 0) && (year % 100 != 0))
            return true;
        if  (year % 400 == 0)
            return true;
        return false;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Month : ");
        int month = scanner.nextInt();
        System.out.print("Enter Year : ");
        int year = scanner.nextInt();
        String Months[] = {"","January", "February", "March","April", "May", "June","July", "August", "September","October", "November", "December"};
        int days[]  = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};// leave empty so that months[1] = "January"
        if (month == 2 && isLeapYear(year)) days[month] = 29;
        System.out.println("   " + Months[month] + " " + year);
        System.out.println(" S  M Tu  W Th  F  S");
        int d = day(month, 1, year);
        for (int i = 0; i < d; i++)
        {
            System.out.println("  ");
        }
        for (int i = 1; i <= days[month]; i++)
        {
            System.out.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[month]))
            {
                System.out.println();
            }
        }

    }
}


