import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
public class demo
{
    public static void main(String[] args)
    {
        Q12();
    }

    public static int GetInteger(String message)
    {
        System.out.println(message);
        Scanner s =new Scanner(System.in);
        int value=s.nextInt();
        return value;
    }

    public static double GetDouble(String Message)
    {
     System.out.println(Message);
     Scanner S=new Scanner(System.in);
     double Value=S.nextDouble();
     return Value;
    }

    public static void Q1()
    {
        int FirstNum=GetInteger("Enter the first number");
        int SecNum=GetInteger("Enter the second number");
        System.out.println(Add( FirstNum, SecNum));
        System.out.println(Diff(FirstNum,SecNum));
        System.out.println(Pro(FirstNum,SecNum));
    }

    public static int Add(int a,int b)
    {
        return a+b;
    }

    public static int Diff(int a,int b)
    {
        return (Math.abs( (a - b)));
    }
    
    public static int Pro(int a,int b)
    {
        return a*b;
    }
    
    public static void Q2()
    {
        int Value1=GetInteger("Enter the first number");
        int Value2=GetInteger("Enter the second number");
        System.out.println(Math.pow(Value1, Value2));
    }

    public static void Q3()
    {
        double Length=GetDouble("Enter the value for length");
        double Width=GetDouble("Enter the value for width");
        double Height=GetDouble("Enter the value for height");
        System.out.println(VolRectangle(Length, Width, Height));
    }
    public static double VolRectangle(double l,double w,double h)
    {
        return l*w*h;
    }

    public static void Q4()
    {
        int Radius=GetInteger("Enter the value for radius");
        double Pie=Math.PI;
        double PerimeterOfCircle=2*Pie*Radius;
        System.out.println("The perimeter of the circle is : "+PerimeterOfCircle);
    }

    public static void Q5()
    {
        int Numerator=GetInteger("Enyer the Numerator");
        int Denominator=GetInteger("Enter the Denominator");
        System.out.println("Quotient: "+Quotient(Numerator, Denominator));
        System.out.println("Remainder: "+Remainder(Numerator, Denominator));
    }

    public static double Quotient(int a,int b)
    {
        return a/b;
    }

    public static int Remainder(int a,int b)
    {
        return a%b;
    }
    
    public static void Q6()
    {
        int Value=GetInteger("Enter the value to find the power of the value");
        System.out.println("The Square of the given value is : "+SquareValue(Value));
    }

    public static int SquareValue(int a)
    {
        return a*a;
    }
    
    public static void Q7()
    {
        int Value=GetInteger("Enter the value to find the square root of the value");
        System.out.println("The Square of the given value is : "+SquareRoot(Value));
    }

    public static double SquareRoot(int a)
    {
        return Math.sqrt(a);
    }

    public static void Q8()
    {
        double Breadth=GetDouble("Enter the value for breadth of the triangle");
        double Height=GetDouble("Enter the value for the height of the triangle");
        System.out.println("The Area of triangle is: "+AreaTriangle(Breadth, Height));
    }

    public static double AreaTriangle(double b,double h)
    {
        return (1/2.0*(b*h));
    }

    public static void Q9()
    {
       int Km=GetInteger("Enter the value for kilo meter:");
       System.out.println("The kilo meter value convert into miles is: "+KmtoMiles(Km));
    }

    public static double KmtoMiles(int num)
    {
        double OneMile=1.60934;
        return num*OneMile;
    }

    public static void Q10()
    {
        double celcius=GetDouble("Enter the celcius value");
        System.out.println("The Fahrenheit value is : "+ Fahrenheit(celcius));
    }

    public static double Fahrenheit(double c)
    {
        return (c*(9/5.0)+32);
    }

    public static void Q11()
    {
        System.out.println("The values before swap");
        int value1=GetInteger("Enter the value for a:");
        int value2=GetInteger("enter the value for b:");
        Swap(value1, value2);
    }

    public static void Swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The values after swap");
        System.out.println("The value for a is:"+a);
        System.out.println("The value for b is:"+b);
    }

    public static void Q12()
    {
        System.out.println("The values before swap");
        int value1=GetInteger("Enter the value for a:");
        int value2=GetInteger("enter the value for b:");
        SwapWithOutTemp(value1, value2);
    }

    public static void SwapWithOutTemp(int a,int b)
    {
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("The values after swap");
        System.out.println("The value for a is:"+a);
        System.out.println("The values for b is"+b);
    }
}

    
