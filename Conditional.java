import java.io.IOException;
import java.util.Scanner;

public class Conditional
{
    public static void main (String[] args)
    {
       Q9();
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
    public static void Q7()
    {
        double Height=GetDouble("Enter your height in centimeter:");
        if(Height>0 && Height<140)
        {
            System.out.println("You are short");
        } 
        else if(Height >140 && Height<160)
        {
            System.out.println("You are Medium");
        }
        else{
            System.out.println("You are tall");
        }
    }
    public static void Q8()
    {
        int FirstValue=GetInteger("Enter the first value");
        int SecondValue=GetInteger("Enter the second value");
        int ThirdValue=GetInteger("Enter the third value");
        LargestThree(FirstValue, SecondValue, ThirdValue);
    }

    public static void LargestThree(int n1,int n2,int n3)
    {
        if(n1<n2)
        {
            if(n1>n2)
            {
                System.out.println("The First value is greatest: "+n2);
            }
            else{
                System.out.println("The Second value is greatest: "+n1);
            }
        }
        else if(n2<n3)
        {
            if(n2>n3)
            {
                System.out.println("The Second value is greatest: "+n2);
            }
            else{
            System.out.println("The Third value is greatest: "+n3);
            }
        }
        else{
            if(n1>n3)
            {
                System.out.println("The First value is greatest: "+n1);
            }
            else{
                System.out.println("The Third value is greatest: "+n3);
            }
        }
    }
    public static void Q9()
    {
        int FirstValue=GetInteger("Enter the first value");
        int SecondValue=GetInteger("Enter the second value");
        int ThirdValue=GetInteger("Enter the third value");
        SmallestThree(FirstValue, SecondValue, ThirdValue);
    }
    public static void SmallestThree(int n1,int n2,int n3)
    {
        if(n1>n2)
        {
            if(n1<n2)
            {
                System.out.println("The First value is smallest: "+n1);
            }
            else{
                System.out.println("The Second value is smallest: "+n2);
            }
        }
        else if(n2>n3)
        {
            if(n2<n3)
            {
                System.out.println("The Second value is smallest: "+n2);
            }
            else{
            System.out.println("The Third value is smallest: "+n3);
            }
        }
        else{
            if(n1<n3)
            {
                System.out.println("The First value is smallest: "+n1);
            }
            else{
                System.out.println("The Third value is smallest: "+n3);
            }
        }
    }
    

    
}
