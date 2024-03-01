import java.io.IOException;
import java.util.Scanner;

public class Conditional
{
    public static void main (String[] args)
    {
       Q5();
    }

    public static int GetInteger(String message)
    {
        System.out.println(message);
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        return num;
    }

    public static double GetDouble(String Message)
    {
        System.out.println(Message);
        Scanner S=new Scanner(System.in);
        double value=S.nextDouble();
        return value;
    }
    
    public static void Q1()
    {
       int Number=GetInteger("Enter the number:");
       PositiveNumber(Number);
    }
    public static void PositiveNumber(int n)
    {
        if(n>0)
        {
            System.out.println("The given number "+ n +" is a positive number");
        }
        else{
            System.out.println("The given number "+ n +" is a negative number");
        }
    }

    public static void Q2()
    {
        int Number1=GetInteger("Enter the first value");
        int Number2=GetInteger("Enter the second value");
        if(Number1==Number2)
        {
            System.out.println("The given two Numbers are equal");
        }
        else{
            System.out.println("The given two Numbers are not equal");
        }
    }

    public static void Q3()
    {
        double Number1=GetDouble("Enter the first value");
        double Number2=GetDouble("Enter the second value");
        if(Number1==Number2)
        {
            System.out.println("The given two Numbers are equal");
        }
        else{
            System.out.println("The given two Numbers are not equal");
        }
    }

    public static void Q4()
    {
        int Number=GetInteger("Enter the number to check the is odd or even");
        if(Number%2==0)
        {
            System.out.println("The given number is even");
        }
        else{
            System.out.println("The given Number is Odd");
        }
    }

    public static void Q5()
    {
        int Number =GetInteger("Enter the year to check the given year is leap year or not");
        if(Number%4==0)
        {
            System.out.println("The given year is the leap year");
        }
        else{
            System.out.println("The given year is not a leap year");
        }
    }

    public static void Q6()
    {
        int age=GetInteger("Enter your age to check yor are eligible for voting or not");
        if(age>=18)
        {
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }





    
}
