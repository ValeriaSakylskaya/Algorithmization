package com.task;

import java.util.Scanner;

public class AlgorithmizationSolution {
    private int multiple;
    private int Sum = 0;
    private Scanner in;
    private double NumberToCompare;
    private int NumberOfReplacements;
    private double SumNegativeElements;
    private double SumPozitiveElements;
    private double SumNullElements;
    private double MaxElement;
    private double MinElement;
    private int MinIndex;
    private int MaxIndex;
    private double MaxSum;
    private int LengthArray;
    private int countnumbers;
    private  int countPopular;
    private int max = 0;
    private int min = 0;
    private  int temp = 0;
    private int mostpopular = 0;

    public AlgorithmizationSolution() {
        this.in = new Scanner(System.in);
        this.NumberOfReplacements = 0;
        this.SumNegativeElements = 0.0D;
        this.SumPozitiveElements = 0.0D;
        this.SumNullElements = 0.0D;
        this.MaxSum = 0.0D;
        this.LengthArray = 0;
    }

    void SearchMultiple(int[] oneDimensionalArray) {
        System.out.println("Enter a number to search for the sum of multiples:");
        this.multiple = this.in.nextInt();

        for(int i = 0; i < oneDimensionalArray.length; ++i) {
            if (oneDimensionalArray[i] % (double)this.multiple == 0.0D) {
                this.Sum = (int)((double)this.Sum + oneDimensionalArray[i]);
            }
        }

        System.out.println("Sum of the items: " + this.Sum);
        this.in.close();
    }

    void ReplaceAllGreaterThen(double[] oneDimensionalArray) {
        System.out.println("Enter number to compare:");
        this.NumberToCompare = (double)this.in.nextFloat();

        for(int i = 0; i < oneDimensionalArray.length; ++i) {
            if (oneDimensionalArray[i] > this.NumberToCompare) {
                oneDimensionalArray[i] = this.NumberToCompare;
                ++this.NumberOfReplacements;
            }
        }

        System.out.println("Количество замен " + this.NumberOfReplacements);
        this.in.close();
    }

    void SearchPozitiveElements(double[] oneDimensionalArray) {
        Sum = 0;
        for(int i = 0; i < oneDimensionalArray.length; ++i) {
            if (oneDimensionalArray[i] > 0) {
                Sum ++;
            }
        }

        System.out.println(" Count Pozitive elements  " + Sum);
    }

    void SearchNullElements(double[] oneDimensionalArray) {
       Sum = 0;
        for(int i = 0; i < oneDimensionalArray.length; ++i) {
            if (oneDimensionalArray[i] == 0.0D) {
                Sum ++;
            }
        }

        System.out.println(" Count null elements  " + Sum);
    }

    void SearchNegativeElements(double[] oneDimensionalArray) {
        Sum = 0;
        for(int i = 0; i < oneDimensionalArray.length; ++i) {
            if (oneDimensionalArray[i] < 0.0D) {
                Sum ++;
            }
        }

        System.out.println(" Count Negative elements  "+ Sum);
    }

    void ReplaceMaxAndMinElements(double[] oneDimensionalArray) {
        this.MaxElement = oneDimensionalArray[0];
        this.MinElement = oneDimensionalArray[0];
        this.MinIndex = 0;
        this.MaxIndex = 0;

        int i;
        for(i = 0; i < oneDimensionalArray.length; ++i) {
            if (oneDimensionalArray[i] > this.MaxElement) {
                this.MaxElement = oneDimensionalArray[i];
                this.MaxIndex = i;
            }

            if (oneDimensionalArray[i] < this.MinElement) {
                this.MinElement = oneDimensionalArray[i];
                this.MinIndex = i;
            }
        }

        System.out.print(" min element: " + this.MinElement + "\n");
        System.out.print(" max element: " + this.MaxElement + "\n");
        oneDimensionalArray[this.MinIndex] = this.MaxElement;
        oneDimensionalArray[this.MaxIndex] = this.MinElement;
        System.out.print("New array : ");

        for(i = 0; i < oneDimensionalArray.length; ++i) {
            System.out.print(oneDimensionalArray[i] + "\n");
        }

    }

    void ElementIsEqualToTheIndex(int[] oneDimensionalArray) {
        System.out.println(" numbers: ");
        for(int i = 0; i < oneDimensionalArray.length; ++i) {
            if (oneDimensionalArray[i] > i) {
                System.out.print(oneDimensionalArray[i] + ";");
            }
        }

    }

    void SumWhereIndexIsSimple(double[] oneDimensionalArray) {
        for(int i = 0; i < oneDimensionalArray.length; ++i) {
            if (SearchSimpleIndex(i + 1) == 1) {
                this.Sum = (int)((double)this.Sum + oneDimensionalArray[i]);
            }
        }

        System.out.println("Sum element " + this.Sum);
    }

    private static int SearchSimpleIndex(int index) {
        for(int i = 2; i < index; ++i) {
            if (index % i == 0) {
                return 0;
            }

            if (i == index || (double)i > Math.sqrt((double)index)) {
                return 1;
            }
        }

        return 1;
    }

    void SearchMinElement(int[] oneDimensionalArray) {
        this.MinElement = oneDimensionalArray[0];

        int i;
        for(i = 0; i < oneDimensionalArray.length; ++i) {
            if (oneDimensionalArray[i] < this.MinElement) {
                this.MinElement = oneDimensionalArray[i];
            }
        }

        System.out.println("New array: \n");

        for(i = 0; i < oneDimensionalArray.length; ++i) {
            if (oneDimensionalArray[i] != this.MinElement) {
                System.out.println(oneDimensionalArray[i]);
            }
        }

    }

    void CompressArray(int[] oneDimensionalArray) {
        System.out.print("Compress Array \n");

        for(int i = 0; i < oneDimensionalArray.length; ++i) {
            if ((i + 1) % 2 == 0) {
                oneDimensionalArray[i] = 0;
            }

            System.out.println(oneDimensionalArray[i]);
        }

    }

    void MaxSumElements(int[] oneDimensionalArray) {
        this.LengthArray = oneDimensionalArray.length;
        this.MaxSum = oneDimensionalArray[0] + oneDimensionalArray[this.LengthArray - 1];

        for(int i = 1; i < this.LengthArray; ++i) {
            if (this.MaxSum < oneDimensionalArray[i] + oneDimensionalArray[this.LengthArray - 2]) {
                this.MaxSum = oneDimensionalArray[i] + oneDimensionalArray[this.LengthArray - 2];
            }

            --this.LengthArray;
        }

        System.out.println( "Max sum  " + this.MaxSum);
    }
    public void PopularElements ( int Array [])
    {
       int  count [] = new int [ Array.length];
       int Arraypopular [] = new int [Array.length];
        for(int i = 0; i < Array.length; i ++) {
            for(int j = i; j < Array.length; j++) {
                if(Array[i]== Array[j]) countnumbers ++;
        }
            count[i] = countnumbers;
            countnumbers = 0;
        }
        for(int i = 0; i < count.length; i++) {

            if( count[i] == 1) countPopular ++;
        }

        if(countPopular == count.length) System.out.println("This array don`t have popular element");
        else {
            max = count[0];
            for(int i = 0;i < count.length; i ++) {
                if(max < count[i]) { max = count[i]; temp = i;}
            }
            for(int i = 0; i < count.length; i ++) {
                if(max == count[i]) {mostpopular ++;}
            }
            if(mostpopular == 1) {
                System.out.println("Number " + Array[temp]+" meet " + max+" count");
            }
            else {
                for(int i = 0;i < count.length; i ++) {
                    if(count[i]==max) { Arraypopular[i] = Array[i];}
                }

                min = Arraypopular[0];
                temp = 0;
                for(int i=0;i<Arraypopular.length;i++) {

                    if(min>Arraypopular[i] && Arraypopular[i]!=0) {min=Arraypopular[i]; temp = i;}
                }
                System.out.println("Number "+ min +" meet " + max+" count");

            }
        }

    }
}
