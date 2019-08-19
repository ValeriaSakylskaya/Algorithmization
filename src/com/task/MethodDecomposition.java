package com.task;

import java.util.Random;

public class MethodDecomposition {

    private double temp = 0;
    private int Sum = 0;
    private int Array [];
    private int sizeArray;
    private int firstelememnt = 0;
    private int countIteration = 0;

    static int  MaxCommonDenominator ( int a , int b)
    {
        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return  Math.abs(a);
    }
    static int MinNOK ( int a , int b)
    {
        int tem;
        if ( a < b) tem = b;
        else tem = a;
        boolean t = true;
        while (t)
        {  if (( tem  % b == 0) && (tem % a == 0))
              {
                 t = false;
              }
            else tem += 1;
        }
        return tem;
    }
    static int  MaxCommonDenominator4Numbers ( int a , int b , int c, int d)
    {
        int min;
        int maxnod = 1;
        min = Min4Numbers( Math.abs(a), Math.abs(b),Math.abs(b),Math.abs(b));
        for ( int i =1 ; i <= min ; i++)
        {
            if ( a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0   )
            {  maxnod = i;}
        }
        return Math.abs(maxnod);
    }
     private  static int Min4Numbers(int a , int b , int c, int d )
     {
         if (a < b && a < c && a < d) {
             return a;
         } else if (b < a && b < c && b < d) {
             return b;
         } else if (c < a && c < b && c < d) {
             return c;
         } else {
             return d;
         }
     }

     static double  SquareHexagon ( double a)
     {
         double Square ;
         Square = 6 * SquareTriangle(a);
         return Square;
     }
    private static double SquareTriangle ( double a)
    {
        double SqTriangle ;
        SqTriangle = ((3 * Math.sqrt( a) )/ 2) * Math.pow( a , 2 );
        return  SqTriangle;
    }
    static int [][]  LargestDistanceBetweenPointCoordinates ( int Array[][])
    {
        double MaxDistance = 0;
        int max [][] = new int [2][2];
        for ( int i = 0 ; i < Array.length; i++ )
        {
            for ( int j = 0; j < Array.length; j++)
            {
                if ( MaxDistance < DistanceCoordidanates( Array[i][0], Array[i][1], Array[j][0], Array[j][1] ))
                {
                 MaxDistance = DistanceCoordidanates( Array[i][0], Array[i][1], Array[j][0], Array[j][1] );
                    max[0][0]=  Array[i][0];
                    max[0][1]=  Array[i][1];
                    max[1][0]=  Array[j][0];
                    max[1][1]=  Array[j][1];
                }
            }
        }
        return max;
    }
    private static double DistanceCoordidanates (int x1 , int y1, int x2, int y2 )
    {
        double distance;
        distance = Math.hypot(x1-x2, y1-y2);
        return  distance;
    }
    static int  SecondMax ( int array [])
    {
        int SecondMaxelement = 0;
        int FirstMAX = Max(array);
        for ( int i = 0; i < array.length; i ++)
        {
            if( SecondMaxelement < array[i] &&  array[i] != FirstMAX)
            {
                SecondMaxelement = array[i];
            }
        }
        return SecondMaxelement;
    }
    private static  int Max ( int array [])
    {
        int maxelement = 0;
        for ( int i = 0; i < array.length; i ++)
        {
            if( maxelement < array[i])
            {
                maxelement = array[i];
            }
        }
        return maxelement;
    }
    static boolean CheckSimpleNumbers ( int a, int b, int c)
    {
       if ( MaxCommonDenominator( a,b) ==1 && MaxCommonDenominator( a,c) ==1 && MaxCommonDenominator( c,b) ==1 )
       {
           return true;
       }
       else {
        return false;}
    }
    static int SumFactorial ( )
    {
       int Sum = 0;
        for ( int i =1; i <= 10; i ++)
        {
            if ( i % 2 != 0)
            {
                Sum += factorial( i );
            }
        }
        return Sum;
    }
    static double SquareQuadrangle ( int a, int b, int c, int d )
    {
        double Square, S1,S2, Diagonal;
        Diagonal =  CalcDiagonal( a,b);
        S1 = (a * b) / 2;
        S2 = 0.25 * Math.sqrt((Diagonal + c + d)*(Diagonal + c - d)*(Diagonal + d - c)*( d + c -Diagonal));
        Square= S1 + S2;
        return Square;
    }
    private static double CalcDiagonal ( int a, int b)    {
        double Diagonal;
        Diagonal = Math.sqrt( a * a  + b *b );
        return  Diagonal;
    }

    private static int factorial(int x){

        if (x == 1){

            return 1;
        }
        return x * factorial(x - 1);
    }

    private static int getCountsOfDigits(long number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;

    }

    static String ComparisonOfNumbersInTwoNumbers ( long a, long b)
    {
        int CountFirst, CountSecond;
        CountFirst = getCountsOfDigits( a);
        CountSecond = getCountsOfDigits( b);
        if ( CountFirst > CountSecond)
        {
            return " In the first number of digits more";
        }
        if ( CountFirst == CountSecond)
        {
            return "They are equal";
        }
        if ( CountFirst < CountSecond)
        {
            return " In the second number of digits more";
        }

        return "Unknown error";
    }
    public void  AscendingSequence ( int n )
    {
        for ( int i =1; i <= (10 - n) ; i++)
        {
            System.out.println( SearchAscendingSequence(i , n) + "  ");
        }
    }
    private static int SearchAscendingSequence (int i, int n )
    {
        double Number = 0;
        int size ;
        size = n - 1;
        for ( int j = 1; j <= n; j ++)
        {
            Number = Number + i * (Math.pow( 10, size));
            size --;
            i ++;
        }
        return (int)Number;
    }
    public void Armstrong ( double n)
    {
        for ( int i = 1 ; i <= n ; i++)
        {
            if (isArmstrongNumber (i)  )
            {
                System.out.println(i );
            }
        }
    }
    private static boolean isArmstrongNumber(int n) {
        int sum = 0, temp = n, remainder, digits = 0;
        while (temp != 0) {
            digits++;
            temp = temp/10;
        }

        temp = n;

        while (temp != 0) {
            remainder = temp%10;
            sum = sum + (int)Math.pow(remainder, digits);
            temp = temp/10;
        }
        if (n == sum)
            return true;
        else
            return false;
    }

    public void DerivingGeminiNumbersFromSection ( int n)
    {
     for ( int i = n; i < (2 * n-2); i ++ )
     {
         if( Simplenumber(i) && Simplenumber( i+2))
         {
             System.out.println("(" + i + ";" + (i+2)+ ") " );
         }
     }
    }
    private static boolean Simplenumber(int n) {
        int kolvo = 0;
        for (int i = 1; i <= (int) Math.sqrt(n); i ++) {
            if (n % i ==0) {
                if (i == Math.sqrt(n))
                    kolvo ++;
                else kolvo += 2;

            }
        }
        if (kolvo == 2 ) return true;//если число простое
        else return false;//если число составное
    }
    public void SumThreeElementsFromSection ( int Array []  , int k , int n)
    {
        if( n + 2 <= Array.length)
        {
         for ( int i = k; i <= n; i ++)
          {
             Sum = Sum + SumThreeElements(Array,i);
          }
         System.out.println(" Sum elements: " + Sum);
        }
        else System.out.println(" error the enter n");
    }
    private static int SumThreeElements ( int Array [], int i)
    {
        int Sum = 0;
        Sum = Array[i]+ Array[i + 1] + Array[i + 2];
        return Sum;
    }
    public  void CreatingAnArrayFromNumbers ( int n)
    {
        sizeArray = getCountsOfDigits(n);
        Array = new int [sizeArray];
        System.out.println(Array.length);
        for ( int i = 0; i < Array.length; i++)
        {
            Array[i] = n % 10;
            n /= 10;
        }
        System.out.print( " ( ");
        for ( int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]+ "  ");
        }
        System.out.print( " ) ");
    }
    public void SearchSumOddNumbers ( int n)
    {
       if ( n == 1) {
           firstelememnt = 1;
       } else  { firstelememnt = (int) Math.pow(10 , n-1);  }
       for ( int i = firstelememnt; i < (int) Math.pow(10,n); i++)
       {
          if (CheckOddnumbers(i))
          {
             Sum = Sum + i;
          }
       }
       System.out.println( " Sum elements:  " + Sum);
       System.out.println("Count Even numbers " + CountEvenNumbers(Sum));


    }
    private static boolean CheckOddnumbers ( int n)
    {
        while ( n != 0)
        {
            if ( (n % 10) % 2 == 0 )
            {
                return false;
            }
            n /= 10;
        }
        return true;
    }
    private static int CountEvenNumbers ( int n)
    {
        int count = 0;
        while ( n != 0)
        {
            if ( (n % 10) % 2 == 0 )
            {
               count ++;
            }
            n /= 10;
        }
        return count;
    }
    public void  SubtractionTheSum ( int n)
    {
        while ( n != 0)
        {
            n =  n - SearchSumnumbers(n);
            countIteration ++;
        }
        System.out.println( " count iteration: " + countIteration);
    }
    private static int SearchSumnumbers ( int n)
    {
        int Sum = 0;
        while ( n != 0)
        {
            Sum = Sum + (n % 10);
            n /= 10;
        }
        return Sum;
    }
    public void FillArrayFromSection ( int Array [], int k, int n)
    {
        for ( int i = 0 ; i < Array.length; i++ )
        {
            Array[i] = Randomnumbers(k , n);
        }
        System.out.print( " ( ");
        for ( int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]+ "  ");
        }
        System.out.print( " ) ");

    }
    private static int Randomnumbers ( int k , int n )
    {
        Random random = new Random();
        int RandomNum = 0;
        while ( SearchSumnumbers(RandomNum) != k )
        {
            RandomNum = random.nextInt(n );
        }
        return  RandomNum;
    }
}
