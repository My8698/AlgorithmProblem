package com.bridgelabz.algorithm;
import java.util.Scanner;
import java.util.regex.Pattern;
public class RegEx
{
    String name;
    String mobNo;
    String date;

    void setName(String name)
    {
        this.name = name;
    }
    void setMobile(String mobNo)
    {
        this.mobNo = mobNo;
    }
    void setDate(String date)
    {
        this.date = date;
    }

    public String getName()
    {
        return name;
    }
    public String getMobile()
    {
        return mobNo;
    }
    public String getDate()
    {
        return date;
    }
    public String toString()
    {
        return ("Name is : "+name +"\nMobile Number Is : "+mobNo +"\nDate Is : "+date);
    }
    public void checkForRegex()
    {
        String str1 = "[A-Z][a-z]";
        boolean result1 = Pattern.matches(str1,getName());

        String str2 = "(91)?[7-9][0-9]{9}";
        boolean result2 = Pattern.matches(str2,getMobile());

        String str3 = "[0-9]/[0-9]/[0-9]";
        boolean result3 = Pattern.matches(str3,getDate());
    }
    public static void main(String[] args)
    {
        RegEx object = new RegEx();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name : ");
        object.setName(scanner.next());
        System.out.println("Enter Mobile Number : ");
        object.setMobile(scanner.next());
        System.out.println("Enter Date");
        object.setDate(scanner.next());
        System.out.println(object.toString());
        object.checkForRegex();
    }
}
