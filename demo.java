import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class demo
{
    public static void main(String[] args)
    {
        Q25();
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

    public static void Q13()
    {
        System.out.println("The values before swap");
        int value1=GetInteger("Enter the value for a:");
        int value2=GetInteger("enter the value for b:");
        SwapWithoutOverFlow(value1, value2);
    }

    public static void SwapWithoutOverFlow(int a,int b)
    {
       a=a^b;
       b=a^b;
       a=a^b;
       System.out.println("The values after swap  ");
       System.out.println("The value for a is:"+a);
       System.out.println("The value for b is"+b);
    }

    public static void Q14()
    {
      System.out.println("The random number is: "+RandomNum());
    }

    public static int RandomNum()
    {
        Random r=new Random();
        int num=r.nextInt(1,100);
        return num;
    }

    public static  void Q15()
    {
      double Length=GetDouble("Enter the value for length in feet");
      double Width=GetDouble("Enter the value for width in feet");
      System.out.println("Area of field in acre: "+AreaOfField(Length, Width));
    }
    public static double AreaOfField(double l,double w)
    {
      int OneAcre=43560;
      return (l*w)/OneAcre;
    }

    public static void Q16()
    {
        int Number=GetInteger("Enter the value to find the sum of Natural numbers:");
        System.out.println("The sum of natural number is:"+NaturalNumbers(Number));
    }

    public static double NaturalNumbers(int n)
    {
        return (n*(n+1)/2);
    }

    public static void Q17()
    {
        int Mark1=GetInteger("Enter the value for mark 1:");
        int Mark2=GetInteger("Enter the value for mark 2:");
        int Mark3=GetInteger("Enter the value for mark 3:");
        System.out.println("The average of the given number is:"+Average(Mark1, Mark2, Mark3));
    }

    public static double Average(int m1,int m2,int m3)
    {
        int result=m1+m2+m3;
        return result/3;
    }

    public static void Q18()
    {
        double Amount=GetDouble("Enter the bill amount");
        System.out.println("The tip percentege of the given value is:"+TipPercentage(Amount));
    }

    public static double TipPercentage(double a)
    {
        return (a*(5/100.0));
    }

    public static void Q19()
    {
        double Amount=GetDouble("Enter the total amount:");
        int TaxPercent=GetInteger("Enter the tax percentage:");
        System.out.println("The net amount of the product is:"+NetAmount(Amount, TaxPercent));
    }

    public static double NetAmount(double amount,int taxPercent)
    {
        return(amount/(1+taxPercent/100.0));
    }

    public static void Q20()
    {
        int BasicPay=GetInteger("Enter the total amount:");
        int DA=GetInteger("Enter the DA percentage:");
        int TA=GetInteger("Enter the TA Percentage:");
        System.out.println("The Gross Pay of the Product is:"+GrossPay(BasicPay, DA, TA));
    }

    public static double GrossPay(int bp,int da,int ta)
    {
        double Da=bp*(da/100.0);
        double Ta=bp*(ta/100.0);
        double Pf=bp*(8/100.0);
        return (bp+Da+Ta-Pf);
    }
    
    public static void Q21()
    {
        int Principle=GetInteger("Enter the principle amount");
        int NumberPeriod=GetInteger("Enter the number of periods");
        double Rate=GetDouble("Enter the Rate");
        System.out.println("the calculated simple interest is:"+SimpleInterest(Principle, NumberPeriod, Rate));
    }

    public static double SimpleInterest(int p,int n,double r)
    {
        return (p*n*r/100.0);
    }

    public static void Q22()
    {
        int Principle=GetInteger("Enter the principle amount:");
        int Years=GetInteger("Enter the time period:");
        int Compound =GetInteger("Enter the annual Compound:");
        double Rate=GetDouble("Enter the interest rate:");
    }

    public static Double CompoundInterest(int p,double n,double c,double r)
    {
        return (p*((1+r/n)Math.pow(n, c)));
    } 

    public static void Q23()
    {
        double Height=GetDouble("Enter the height in cm:");
        System.out.println(Height/2.54);
    }

    public static void Q25()
    {
        Scanner name=new Scanner(System.in);
        System.out.println("Enter your name:");
        String Name=name.nextLine();
        int RollNo=GetInteger("Enter the roll no:");
        int Mark1=GetInteger("Enter the Value for mark 1:");
        int Mark2=GetInteger("Enter the value for mark 2");
        int Mark3=GetInteger("Enter the value for mark 3");
        System.out.println("Your Name is: "+Name);
        System.out.println("Your roll number is: "+RollNo);
        System.out.println("Your Mark in subject 1:"+Mark1);
        System.out.println("Your Mark in subject 2:"+Mark2);
        System.out.println("Your Mark in subject 3:"+Mark3);
        Rank(Mark1, Mark2, Mark3);
    }

    public static void Rank(int m1,int m2,int m3)
    {
        int total=m1+m2+m3;
        double avrg=total/3;
        System.out.println("Total: "+total);
        System.out.println("Average: "+avrg);
    }

}

    
