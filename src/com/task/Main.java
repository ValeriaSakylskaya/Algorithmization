package com.task;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int task;
        int Row = 0;
        int Column = 0;
        int section = 0;
        int size = 0;
        int numberA = 0;
        int numberB = 0;
        int numberC = 0;
        int numberD= 0;
        double side = 0;
        Scanner in = new Scanner(System.in);
        AlgorithmizationSolution solutionArray = new AlgorithmizationSolution();
        SolutionMatrix solution = new SolutionMatrix();
        Sorting sort = new Sorting();
        ArrayFill fillarray = new ArrayFill();
        MethodDecomposition metod = new MethodDecomposition();
        System.out.print(" Enter the section  ");
        section = in.nextInt();
        System.out.print("Enter the task number ");
        task = in.nextInt();
       if (section ==1){
           System.out.print("Enter the size of the array: ");
           int sizeArray = in.nextInt();
           double[] inputArray= new double[sizeArray];
           int [] inputIntArray = new int [sizeArray];
           ArrayFill myArray = new ArrayFill();
           if (task == 1) {
               myArray.fillInt(inputIntArray);
               solutionArray.SearchMultiple(inputIntArray);
           }
           if (task == 2) {
               myArray.fillFloat(inputArray);
               solutionArray.ReplaceAllGreaterThen(inputArray);
           }
           if (task == 3) {
               myArray.fillFloat(inputArray);
               solutionArray.SearchPozitiveElements(inputArray);
               solutionArray.SearchNullElements(inputArray);
               solutionArray.SearchNegativeElements(inputArray);
           }
           if (task == 4) {
               myArray.fillFloat(inputArray);
               solutionArray.ReplaceMaxAndMinElements(inputArray);
           }
           if (task == 5) {
               myArray.fillInt(inputIntArray);
               solutionArray.ElementIsEqualToTheIndex(inputIntArray);
           }
           if (task == 6) {
               myArray.fillFloat(inputArray);
               solutionArray.SumWhereIndexIsSimple(inputArray);
           }
           if (task == 8) {
               myArray.fillInt(inputIntArray);
               solutionArray.SearchMinElement(inputIntArray);
           }
           if (task == 7) {
               if (sizeArray % 2 != 0) {
                   System.out.print("Enter even number: ");
                   sizeArray = in.nextInt();
                   int[] inputArrayNew = new int[sizeArray];
                   myArray.fillInt(inputArrayNew);
                   solutionArray.MaxSumElements(inputArrayNew);
               } else {
                   myArray.fillInt(inputIntArray);
                   solutionArray.MaxSumElements(inputIntArray);
               }
           }
           if ( task ==9)
            {
              myArray.fillInt(inputIntArray);
              solutionArray.PopularElements(inputIntArray);
          }
           if (task == 10) {
               myArray.fillInt(inputIntArray);
               solutionArray.CompressArray(inputIntArray);
           }

       }
        if (section == 2) {
            if (task == 1) {
                System.out.println(" enter the count row");
                Row = in.nextInt();
                System.out.println(" enter the count column");
                Column = in.nextInt();
                int InputArray[][] = new int[Row][Column];
                FillMatrix fill = new FillMatrix();
                fill.Fill(InputArray);
                solution.OddColums(InputArray);
            }
            if (task == 2) {
                System.out.println(" enter the count column");
                Column = in.nextInt();
                int InputArray[][] = new int[Column][Column];
                FillMatrix fill = new FillMatrix();
                fill.Fill(InputArray);
                solution.DisplayElementDiagonal(InputArray);
            }
            if (task == 3) {
                System.out.println(" enter the count row");
                Row = in.nextInt();
                System.out.println(" enter the count column");
                Column = in.nextInt();
                int InputArray[][] = new int[Row][Column];
                FillMatrix fill = new FillMatrix();
                fill.Fill(InputArray);
                solution.DisplayRowAndColumn(InputArray);
            }
            if (task == 4) {
                solution.FormTheMatrix1n();

            }
            if (task == 5) {
                solution.FormTheMatrixNull();

            }
            if (task == 6) {
                solution.FillMatrixNullOne();

            }
            if (task == 7) {
                solution.FormTheMatrixNullSin();

            }
            if (task == 8) {
                System.out.println(" enter the count row");
                Row = in.nextInt();
                System.out.println(" enter the count column");
                Column = in.nextInt();
                int InputArray[][] = new int[Row][Column];
                FillMatrix fill = new FillMatrix();
                fill.Fill(InputArray);
                solution.SwapColumns(InputArray);

            }
            if (task == 9) {
                System.out.println(" enter the count row");
                Row = in.nextInt();
                System.out.println(" enter the count column");
                Column = in.nextInt();
                int InputArray[][] = new int[Row][Column];
                FillMatrix fill = new FillMatrix();
                fill.Fill(InputArray);
                solution.MatrixPozitiveElements(InputArray);

            }
            if (task == 10) {
                System.out.println(" enter the count column");
                Column = in.nextInt();
                int InputArray[][] = new int[Column][Column];
                FillMatrix fill = new FillMatrix();
                fill.Fill(InputArray);
                solution.MatrixPozitiveDiagonal(InputArray);

            }
            if (task == 11) {
                solution.fillmatrix0to15();

            }
            if (task == 12) {
                System.out.println(" enter the count row");
                Row = in.nextInt();
                System.out.println(" enter the count column");
                Column = in.nextInt();
                int InputArray[][] = new int[Row][Column];
                FillMatrix fill = new FillMatrix();
                fill.Fill(InputArray);
                solution.SortAscendingRow(InputArray);
                solution.SortDescendingRow(InputArray);
            }
            if (task == 13) {
                System.out.println(" enter the count row");
                Row = in.nextInt();
                System.out.println(" enter the count column");
                Column = in.nextInt();
                int InputArray[][] = new int[Row][Column];
                FillMatrix fill = new FillMatrix();
                fill.Fill(InputArray);
                solution.SortAscendingColumn(InputArray, Row,Column);
                solution.SortDescendingColumn(InputArray, Row,Column);
            }
            if (task == 14) {
                solution.FillMatrixOneNull();
            }
            if (task == 15) {
                System.out.println(" enter the count row");
                Row = in.nextInt();
                System.out.println(" enter the count column");
                Column = in.nextInt();
                int InputArray[][] = new int[Row][Column];
                FillMatrix fill = new FillMatrix();
                fill.Fill(InputArray);
                solution.ReplaceOfOddElemenetsWithMax(InputArray);
            }
            if (task == 16) {
                solution.MagicSquare();
            }
        }
        if (section == 3) {
            if (task == 1) {
                sort.JoinArrays();
        }
            if (task == 2) {
                sort.SequenceSorting();
            }
            if (task == 3) {
                sort.SelectionSort();
            }
            if (task == 4) {
                sort.ExchangeSorting();
            }
            if (task == 5) {
                sort.InsertionSort();
            }
            if (task == 6) {
                sort.SortShell();
            }
            if (task == 7) {
                sort.SearchForInsertionPlace();
            }
            if (task == 8) {
                sort.FractionSorting();
            }
        }
        if (section == 4) {
            if (task == 1) {
                System.out.println(" enter two numbers");
                numberA = in.nextInt();
                numberB = in.nextInt();
                System.out.println("max common Denominator : " + metod.MaxCommonDenominator(numberA, numberB));
                System.out.println("minimum common Multiple : " + metod.MinNOK(numberA, numberB));
            }
            if (task == 2) {
                System.out.println(" enter 4 numbers");
                numberA = in.nextInt();
                numberB = in.nextInt();
                numberC = in.nextInt();
                numberD = in.nextInt();
                System.out.println("max common Denominator for 4 numbers : " + metod.MaxCommonDenominator4Numbers (numberA, numberB , numberC, numberD));
            }
            if (task == 3) {
                System.out.println(" enter side a of the hexagon");
                side = in.nextDouble();
                System.out.println(" Square hexagon " + metod.SquareHexagon( side));

            }
            if (task == 4) {
                System.out.println(" enter count dots ");
                size = in.nextInt();

                int  DotsArray [][] = new int [ size][2];
                for ( int i = 0; i < size; i ++ )
                {
                    System.out.println("  enter coordinators "+ (i+1) +" dot");
                    DotsArray[i][0] = in.nextInt();
                    DotsArray[i][1] = in.nextInt();
                }
                System.out.println(" Array coordinators dots ");
                for ( int i = 0; i < size; i ++ )
                {
                    System.out.print("[ " + DotsArray[i][0]+"," + DotsArray[i][1] +"]" );
                }
                int result [][];
                result = metod.LargestDistanceBetweenPointCoordinates( DotsArray);
                System.out.print("\n Coordiantes the largest distance :");
                for ( int i = 0; i < result.length; i ++ )
                {
                    System.out.print(" [ " + result[i][0]+"," + result[i][1] +"]" );
                }
            }
            if (task == 5) {
                System.out.println(" enter the size array");
                size = in.nextInt();
                int Array [] = new int [size];
                fillarray.fillInt(Array);
                System.out.println(" Second max element " + metod.SecondMax(Array));

            }
            if (task == 6){
                System.out.println(" enter the 3 numbers");
                numberA = in.nextInt();
                numberB = in.nextInt();
                numberC = in.nextInt();
                System.out.println(" Answer : " + metod.CheckSimpleNumbers( numberA, numberB, numberC));
            }
            if (task == 7){
                System.out.println(" Sum of factorials of numbers from 1 to 9 ");
                System.out.println(" Answer : " + metod.SumFactorial());
            }
            if (task == 8) {
                System.out.println(" enter the size array");
                size = in.nextInt();
                int InputArray [];
                InputArray = new int [size];
                fillarray.fillInt(InputArray);
                System.out.println(" enter the k");
                numberA = in.nextInt() - 1;
                System.out.println(" enter the n");
                numberB = in.nextInt() - 1;
                metod.SumThreeElementsFromSection(InputArray ,numberA , numberB);

            }
            if (task == 9){
                System.out.println(" enter the X ");
                numberA = in.nextInt();
                System.out.println(" enter the Y ");
                numberB = in.nextInt();
                System.out.println(" enter the Z ");
                numberC = in.nextInt();
                System.out.println(" enter the T ");
                numberD = in.nextInt();
                System.out.println(" Square Quadrangle " + metod.SquareQuadrangle( numberA, numberB, numberC, numberD));

            }
            if (task == 10) {
                System.out.println("enter the n");
                numberA = in.nextInt();
                metod.CreatingAnArrayFromNumbers( numberA);
            }
            if (task == 11){
                System.out.println(" enter the  first number");
                numberA = in.nextInt();
                System.out.println(" enter the second number ");
                numberB = in.nextInt();

                System.out.println(" answer " + metod.ComparisonOfNumbersInTwoNumbers( numberA, numberB));

            }
            if (task == 12) {
                System.out.println(" enter the size array");
                size = in.nextInt();
                int InputArray [];
                InputArray = new int [size];
                System.out.println(" enter the k");
                numberA = in.nextInt() ;
                System.out.println(" enter the n");
                numberB = in.nextInt();
                metod.FillArrayFromSection(InputArray, numberA, numberB);
            }
            if (task ==13) {
                System.out.println( " enter the n , where n  more the 2");
                numberA = in.nextInt();
                metod.DerivingGeminiNumbersFromSection( numberA);
            }
            if (task == 14) {
                System.out.println(" enter the n");
                numberA = in.nextInt();
                metod.Armstrong(numberA);
            }
            if (task == 15) {
                System.out.println(" enter the n");
                numberA = in.nextInt();
                metod.AscendingSequence( numberA);

            }
            if (task == 16) {
                System.out.println(" enter the n");
                numberA = in.nextInt();
                metod.SearchSumOddNumbers( numberA);
            }
            if (task == 17) {
                System.out.println(" enter the n");
                numberA = in.nextInt();
                metod.SubtractionTheSum( numberA);
            }
            }
            }
        }





