package com.task;

import com.sun.jdi.Value;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SolutionMatrix {
    private Scanner in= new Scanner(System.in);
    private int InputRow = 0;
    private int InputColumn = 0;
    private int SwapColumn = 0;
    private int index = 0;
    private int ValueEven;
    private int  ValueOdd;
    private int Count = 0;
    private int SwapElement = 0;
    private int Sum = 0;
    private int MaxSum = 0;
    private int temp = 0;
    private int MaxElement = 0;
    private int RandomRow = 0;
    private int RandomColumn = 0;
    private int RandomRow1 = 0;
    private int RandomColumn1 = 0;
    private boolean bool ;
    DecimalFormat formatdecimal = new DecimalFormat("00.00");
    void OddColums (int[][] Array)
    {
        System.out.println("New matrix");
        for ( int i = 0; i < Array.length; i ++)
        {   for ( int j = 0; j < Array[i].length; j ++ )
            {
                if( (j+1) % 2 != 0 & Array[0][j] > Array[Array.length - 1][j] )
                {
                    System.out.print(Array[i][j] + " ");
                }
            }
           System.out.print("\n");
            }
        }
        void  DisplayElementDiagonal (int[][] Array)
        {
            System.out.println("Diagonal elements :  ");
            for ( int i = 0; i < Array.length; i ++)
            {
                for (int j = 0; j < Array[i].length; j ++)
                {
                    if ( i == j)
                    {
                        System.out.print(Array[i][j] + ";");
                    }
                }
            }
        }
        void DisplayRowAndColumn (int[][] Array)
        {
            System.out.print("Enter row: ");
            InputRow = in.nextInt();
            System.out.print(" Row: ");
            for( int j = 0; j < Array[InputRow -1].length; j ++)
            {
                System.out.print(Array[InputRow -1][j] + ";");
            }
            System.out.print("\n Enter column: ");
            InputColumn = in.nextInt();
            System.out.print(" column: \n");
            for( int i = 0; i < Array.length; i ++)
            {
                System.out.print(Array[i][InputColumn -1] + "\n");}
        }
        void  FormTheMatrix1n ()
        {
            System.out.print("Enter an even number: ");
            index = in.nextInt();
            int[][] Array = new int[index][index];
            ValueEven = index;
            ValueOdd = 1;
            for ( int i = 0; i < Array.length; i ++)
            {
                if ( (i + 1) % 2 != 0)
                {
                    for ( int j = 0 ; j < Array.length; j ++)
                    {
                        Array[i][j] = ValueOdd;
                        ValueOdd ++;
                    }
                    ValueOdd = 1;
                    }
                    else
                    {
                        for ( int j = 0 ; j < Array.length; j ++)
                        {
                            Array[i][j] = ValueEven;
                            ValueEven = ValueEven - 1;
                        }
                        ValueEven = index;
                    }
            }
            System.out.print( "Fill massiv \n");
            for ( int i = 0; i < Array.length; i ++)
            {
                for ( int j = 0 ; j < Array.length; j ++)
                {
                    System.out.print(Array[i][j] + " ");
                }
                System.out.print( " \n");
            }
        }
    void  FormTheMatrixNull ()
    {
        System.out.print("Enter an even number: ");
        index = in.nextInt();
        int[][] Array = new int[index][index];
        ValueEven = index;
        ValueOdd = 1;
        for ( int i = 0; i < Array.length; i ++)
        {
            for ( int j =0; j < Array.length; j ++)
            {
                if  ( j < ValueEven)
                {
                    Array[i][j] = ValueOdd;
                }
                else
                {
                    Array[i][j] = 0;
                }

            }
            ValueOdd ++;
            ValueEven = ValueEven - 1;
        }
        System.out.print( "Fill massiv \n");
        for ( int i = 0; i < Array.length; i ++)
        {
            for ( int j = 0 ; j < Array.length; j ++)
            {
                System.out.print(Array[i][j] + " ");
            }
            System.out.print( " \n");
        }
    }
    void  FormTheMatrixNullSin ()
    {
        System.out.print("Enter an even number: ");
        index = in.nextInt();
        double[][] Array = new double[index][index];
        for ( int i = 0; i < Array.length; i ++)
        {
            for ( int j =0; j < Array.length; j ++)
            {
                Array[i][j] =  Math.sin(( (i * i) - ( j * j)) / index);
                if ( Array[i][j] > 0)
                {
                    Count ++;
                }
            }
        }
        System.out.print( "Fill massiv \n");
        for ( int i = 0; i < Array.length; i ++)
        {
            for ( int j = 0 ; j < Array.length; j ++)
            {
                System.out.print( formatdecimal.format( Array[i][j]) + " ");
            }
            System.out.print( " \n");
        }
        System.out.print( "Count pozitive elements \n" + Count);
    }
    void SwapColumns (int[][] Array)
    {
        System.out.println("\n Enter column: ");
        InputColumn = in.nextInt() - 1;
        System.out.println("\n Enter column: ");
        SwapColumn = in.nextInt() - 1;
        for ( int i = 0; i < Array.length; i ++)
        {
            SwapElement = Array[i][InputColumn];
            Array[i][InputColumn ] = Array [i][SwapColumn];
            Array [i][SwapColumn] = SwapElement;
            for ( int j = 0; j< Array[i].length; j ++)
            {
                System.out.print(Array[i][j] + " ");
            }
            System.out.print( " \n");
        }
    }
    void MatrixPozitiveElements (int[][] Array)
    {
        for ( int j = 0; j < Array[1].length; j ++)
        {
            for ( int i = 0; i < Array.length; i ++)
            {
                Sum += Array[i][j];
            }
            System.out.println(" Sum column "+ (j + 1) + ": " + Sum);
            if ( MaxSum < Sum)
            {
                MaxSum = Sum;
            }
            Sum = 0;
        }
        System.out.println("  Max Sum : " + MaxSum);
    }
    void MatrixPozitiveDiagonal (int[][] Array)
    {
        for ( int i = 0; i < Array.length; i ++)
        {
            for ( int j = 0; j < Array[i].length; j ++)
            {
                if ( i == j & Array[i][j] > 0) {
                    System.out.println("  Pozitive elemets diagonal: " + Array[i][j]);
                }
            }
        }

    }
    void fillmatrix0to15 ( )
    {
        int[][] Array = new int[15][20];
        for( int i = 0; i < Array.length; i ++)
        {
            for (int j = 0; j < Array[i].length; j ++)
            {
                Array[i][j] = (int)(Math.random()*15);
                System.out.print(Array[i][j] + " ");
            }
            System.out.print( " \n");
        }
        for( int i = 0; i < Array.length; i ++)
        {
            for (int j = 0; j < Array[i].length; j ++)
            {
                if( Array[i][j] == 5)
                {
                    Count ++;
                }
            }
            if ( Count > 3)
            {
                System.out.print( " Row :" + (i+1));
            }
        }
    }
    void SortDescendingRow (int[][] Array)
    {
        System.out.print("\n");
        for( int i = 0; i < Array.length; i ++) {
            for (int j = 0; j < Array[i].length ; j++) {
                for (int k = j+1; k < Array[i].length; k++ )
                {
                    if ( Array[i][j] < Array[i][k])
                    {
                        temp = Array[i][j];
                        Array[i][j] = Array[i][k];
                        Array[i][k] = temp;
                    }
                }
            }
        }
            for( int i = 0; i < Array.length; i ++) {
                for (int j = 0; j < Array[i].length; j++) {
                    System.out.print(Array[i][j] + " ");
                }
                System.out.print("\n");
             }
        }

    void SortAscendingRow (int[][] Array)
    {
        for ( int i = 0; i < Array.length; i ++)
        {
            for ( int j = 0; j < Array[i].length; j ++)
            {
                Arrays.sort(Array[i]);
            }
        }
        System.out.print("\n");
        for( int i = 0; i < Array.length; i ++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    void SortAscendingColumn (int[][] Array, int  row,int column)
    {
      for( int j = 0; j < column; j ++)
      {
          for ( int i = 0; i < row; i++ )
          {
              for (int k = i + 1; k < row; k++ )
              {
                  if ( Array[i][j] > Array[k][j])
                  {
                      temp = Array[i][j];
                      Array[i][j] = Array[k][j];
                      Array[k][j] = temp;
                  }
              }
          }
      }

        System.out.print("\n");
        for( int i = 0; i < Array.length; i ++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    void SortDescendingColumn (int[][] Array, int  row,int column)
    {
        for( int j = 0; j < column; j ++)
        {
            for ( int i = 0; i < row; i++ )
            {
                for (int k = i + 1; k < row; k++ )
                {
                    if ( Array[i][j] < Array[k][j])
                    {
                        temp = Array[i][j];
                        Array[i][j] = Array[k][j];
                        Array[k][j] = temp;
                    }
                }
            }
        }

        System.out.print("\n");
        for( int i = 0; i < Array.length; i ++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    void FillMatrixOneNull ()
    {
        System.out.print("Enter row: ");
        InputRow = in.nextInt();
        int[][] FillArray = new int[InputRow][InputRow];

            for (int j = 0; j < FillArray.length; j ++)
            {
                temp =0;
                for( int i = 0; i < FillArray[j].length; i ++)
                {
                FillArray[i][j] = (int)(Math.round(Math.random()));
                if ( FillArray[i][j] != 0 )
                {
                   if (temp < j + 1)
                   {
                       temp ++;
                   }
                   else
                       {
                           FillArray[i][j] = 0;
                       }
                }
            }
        }
        System.out.print(" Fill matrix: \n");
        for( int i = 0; i < FillArray.length; i ++) {
            for (int j = 0; j < FillArray[i].length; j++) {
                System.out.print(FillArray[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    void FillMatrixNullOne ()
    {
        System.out.print("Enter even number ");
        InputRow = in.nextInt();
        int[][] FillArray = new int[InputRow][InputRow];
        temp = FillArray.length / 2;
        ValueEven = FillArray.length;
        ValueOdd = 0;
        for ( int i = 0 ; i < temp; i++)
        {
            for( int j = 0; j < FillArray.length; j++)
            {
                if  ( j < ValueEven &&  j >= i )
                {
                    FillArray[i][j] = 1;
                }
                else
                {
                    FillArray[i][j] = 0;
                }
            }
            ValueEven  --; ValueOdd ++;
        }
        ValueEven = FillArray.length;
        ValueOdd = 0;
        for ( int i = FillArray.length - 1 ; i >= temp; i--)
        {
            for( int j = 0; j < FillArray.length; j++)
            {
                if  ( j < ValueEven & j > ValueOdd - 1 )
                {
                    FillArray[i][j] = 1;
                }
                else
                {
                    FillArray[i][j] = 0;
                }
            }
            ValueEven  --; ValueOdd ++;
        }
        System.out.print(" Fill matrix: \n");
        for( int i = 0; i < FillArray.length; i ++) {
            for (int j = 0; j < FillArray[i].length; j++) {
                System.out.print(FillArray[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    void SearchMaxElement (int[][] Array)
    {
        for ( int i = 0; i < Array.length; i ++)
        {
            for ( int j = 0; j < Array[i].length; j ++)
            {
                if ( MaxElement < Array[i][j])
                {
                    MaxElement = Array[i][j];
                }
            }
        }
        System.out.println(" Max element: " + MaxElement);
    }
   void ReplaceOfOddElemenetsWithMax (int[][] Array)
   {
      this.SearchMaxElement(Array );
       for ( int i = 0; i < Array.length; i ++)
       {
           for ( int j = 0; j < Array[i].length; j ++)
           {
               if ( Array[i][j] % 2 != 0 || Array[i][j] == 0)
               {
                   Array[i][j] = this.MaxElement;
               }
           }
       }
       for( int i = 0; i < Array.length; i ++) {
           for (int j = 0; j < Array[i].length; j++) {
               System.out.print(Array[i][j] + " ");
           }
           System.out.print("\n");
       }
   }
   void MagicSquare ( )
   {
       System.out.println(" enter the size");
       InputRow = in.nextInt();
       int[][] magicSquare = new int[InputRow][InputRow];

          temp = 1;
       for (int i = 0; i < magicSquare.length; i++) {
           for (int j = 0; j < magicSquare.length; j++) {
               magicSquare[i][j]= temp;
               temp ++;
           }
       }
       bool = false;
       while ( SumRowMagic(magicSquare) != 1 || SumColumnMagic(magicSquare) != 1 || SumDiagonal(magicSquare) != 1 ){

           RandomColumn = (int)Math.round((Math.random()* (InputRow - 1)) );
          RandomRow = (int)Math.round((Math.random()* (InputRow - 1)) );
           RandomColumn1 = (int)Math.round((Math.random()* (InputRow - 1)) );
           RandomRow1 = (int)Math.round((Math.random()* (InputRow - 1)) );
           temp = magicSquare[RandomRow][RandomColumn];
           magicSquare[RandomRow][RandomColumn] = magicSquare[RandomRow1][RandomColumn1];
           magicSquare[RandomRow1][RandomColumn1] = temp;

       }
       for( int i = 0; i < magicSquare.length; i ++) {
           for (int j = 0; j < magicSquare[i].length; j++) {
               System.out.print(magicSquare[i][j] + " ");
           }
           System.out.print("\n");
       }
   }
   private static  int SumDiagonal (int[][] Array) {
       int SumDiagonal1 = 0;
       int SumDiagonal2 = 0;
       int lenth = Array.length - 1;
       for (int i = 0; i < Array.length; i++) {
           for (int j = 0; j < Array.length; j++) {
               if (i == j) {
                   SumDiagonal1 = SumDiagonal1 + Array[i][j];
               }
           }
       }
       for (int i = 0; i < Array.length; i++) {

                   SumDiagonal2 = SumDiagonal2 + Array[i][lenth];
           lenth --;
           }
       if ( SumDiagonal1 == SumDiagonal2)
    {
        return 1;
    }
    else
        { return 0 ;}
    }
    private static int SumRowMagic (int[][] Array)
    {
        int SumRow = 0;
        int AllSum = 0;
        int lenth = Array.length;
        int result = 0 ;
        int count = 0;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                AllSum = AllSum + Array[i][j];
            }
        }
        for ( int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                SumRow = SumRow + Array[i][j];
            }
            if (AllSum / lenth == SumRow) {
               count ++;
            }
            SumRow = 0;
        }
        if (count == lenth ) result = 1;
        else result = 0;
        return result;
    }
    private static int SumColumnMagic (int[][] Array)
    {
        int SumColumn = 0;
        int AllSum = 0;
        int lenth = Array.length;
        int result = 0 ;
        int count = 0;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                AllSum = AllSum + Array[i][j];
            }
        }
        for (int i = 0; i < Array.length; i++)
        {
            for ( int j = 0; j < Array.length; j ++)
            {
                SumColumn = SumColumn + Array[j][i];
            }
            if (AllSum / lenth == SumColumn) {
                count ++;
            }
            SumColumn = 0;
        }
        if (count == lenth ) result = 1;
        else result = 0;
        return result;
    }
    }





