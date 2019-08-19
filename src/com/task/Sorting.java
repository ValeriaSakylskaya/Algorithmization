package com.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
public class Sorting {
    private int index = 0;
    private int sizeFirstArray = 0;
    private int sizeSecondArray = 0;
    private int temp = 0;
    private int MaxID = 0;
    private int Enumerator = 0;
    private int denominator = 0;
    private int numerator = 0;
    private int quantity = 0;
    private boolean isSorted;
    private ArrayFill fillarray = new ArrayFill();
    Scanner in = new Scanner(System.in);

    void JoinArrays() {
        System.out.print("enter the size first array ");
        sizeFirstArray = in.nextInt();
        ArrayList<Integer> firstArr = new ArrayList<Integer>();
        System.out.print("enter the size second array ");
        sizeSecondArray = in.nextInt();
        int[] SecondArray = new int[sizeSecondArray];
        for (int i = 0; i < sizeFirstArray; i++) {
            System.out.println("\n Enter the " + (i + 1) + " element first array");
            firstArr.add(in.nextInt());
        }
        System.out.println(" First array :" + firstArr);
        for (int i = 0; i < SecondArray.length; i++) {
            System.out.println("\n Enter the " + (i + 1) + " element second array");
            SecondArray[i] = in.nextInt();
        }
        System.out.println(" Second array :" + SecondArray);

        System.out.println("\n enter the element from which you want to start joining ");
        index = in.nextInt();
        for (int i = 0; i < SecondArray.length; i++) {
            firstArr.add(index, SecondArray[i]);
            index++;
        }
        System.out.println("  New  array :" + firstArr);


    }


    void SequenceSorting() {
        System.out.print("enter the size first array ");
        sizeFirstArray = in.nextInt();
        ArrayList<Integer> firstArr = new ArrayList<Integer>();
        System.out.print("enter the size second array ");
        sizeSecondArray = in.nextInt();
        int[] SecondArray = new int[sizeSecondArray];
        for (int i = 0; i < sizeFirstArray; i++) {
            System.out.println("\n Enter the " + (i + 1) + " element second array");
            firstArr.add(in.nextInt());
        }
        Collections.sort(firstArr);
        System.out.println(" First array :" + firstArr);
        for (int i = 0; i < SecondArray.length; i++) {
            System.out.println("\n Enter the " + (i + 1) + " element second array");
            SecondArray[i] = in.nextInt();
        }
        Arrays.sort(SecondArray);
        System.out.println(" Second array :");
        for (int i = 0; i < SecondArray.length; i++) {
            System.out.print(SecondArray[i] + " ");
        }
        for (int i = 0; i < SecondArray.length; i++) {
            firstArr.add(SecondArray[i]);
        }
        Collections.sort(firstArr);
        System.out.println("\n  New  array :" + firstArr);

    }

    void SelectionSort() {
        System.out.print("enter the size  array ");
        index = in.nextInt();
        int[] InputArray = new int[index];
        fillarray.fillInt(InputArray);
        System.out.println("  Array  before sort:");
        for (int i = 0; i < InputArray.length; i++) {
            System.out.print(InputArray[i] + " ");
        }
        for (int i = 0; i < InputArray.length; i++) {
            MaxID = i;
            for (int j = i; j < InputArray.length; j++) {
                if (InputArray[j] > InputArray[MaxID]) {
                    MaxID = j;
                }
            }
            temp = InputArray[i];
            InputArray[i] = InputArray[MaxID];
            InputArray[MaxID] = temp;
        }
        System.out.println("\n Array  after sort:");
        for (int i = 0; i < InputArray.length; i++) {
            System.out.print(InputArray[i] + " ");
        }
    }

    void InsertionSort() {
        System.out.print("enter the size  array ");
        index = in.nextInt();
        int[] InputArray = new int[index];
        fillarray.fillInt(InputArray);
        System.out.println("  Array  before sort:");
        for (int i = 0; i < InputArray.length; i++) {
            System.out.print(InputArray[i] + " ");
        }

        for ( int i = 1; i < InputArray.length; i++) {
            index = BinarySearch (InputArray, 0, i, InputArray[i]);
            if (index < i) {
                temp = InputArray[i];
                for ( int j = i - 1; j >= index; j--)
                    InputArray[j + 1] = InputArray[j];
                InputArray[index] = temp;
            }
        }
        System.out.println("  Array  after sort:");
        for (int i = 0; i < InputArray.length; i++) {
            System.out.print(InputArray[i] + " ");
        }
    }

    void SortShell() {
        System.out.print("enter the size  array ");
        index = in.nextInt();
        int[] InputArray = new int[index];
        fillarray.fillInt(InputArray);
        System.out.println("  Array  before sort:");
        for (int i = 0; i < InputArray.length; i++) {
            System.out.print(InputArray[i] + " ");
        }
        int j = 0;
        while ((j + 1) < InputArray.length)
            if (InputArray[j] > InputArray[j + 1]) {
                temp = InputArray[j];
                InputArray[j] = InputArray[j + 1];
                InputArray[j + 1] = temp;
                if (j > 0) {
                    j--;
                }
            } else {
                j++;
            }
        System.out.println("\n Array  after sort:");
        for (int i = 0; i < InputArray.length; i++) {
            System.out.print(InputArray[i] + " ");
        }
    }

    void SearchForInsertionPlace() {
        System.out.print("enter the size first array ");
        sizeFirstArray = in.nextInt();
        ArrayList<Integer> firstArr = new ArrayList<Integer>();
        System.out.print("enter the size second array ");
        sizeSecondArray = in.nextInt();
        ArrayList<Integer> SecondArray = new ArrayList<Integer>();
        ArrayList<Integer> Indexs = new ArrayList<Integer>();
        for (int i = 0; i < sizeFirstArray; i++) {
            System.out.println("\n Enter the " + (i + 1) + " element second array");
            firstArr.add(in.nextInt());
        }
        Collections.sort(firstArr);
        System.out.println(" First array :" + firstArr);
        for (int i = 0; i < sizeSecondArray; i++) {
            System.out.println("\n Enter the " + (i + 1) + " element second array");
            SecondArray.add(in.nextInt());
        }
        Collections.sort(SecondArray);
        System.out.println(" Second array :" + SecondArray);
        for (int i = 0; i < SecondArray.size(); i++) {
            int tem = Collections.binarySearch(firstArr, SecondArray.get(i));
            if (tem < 0) Indexs.add(-(tem + 1) + i);
            else Indexs.add(tem + i);
        }
        System.out.println(" Index for insert :" + Indexs);
        for (int i = 0; i < Indexs.size(); i++) firstArr.add(Indexs.get(i), SecondArray.get(i));
        System.out.println("После вставки " + firstArr);
    }

    void ExchangeSorting() {
        System.out.print("enter the size  array ");
        index = in.nextInt();
        int[] InputArray = new int[index];
        fillarray.fillInt(InputArray);
        System.out.println("  Array  before sort:");
        for (int i = 0; i < InputArray.length; i++) {
            System.out.print(InputArray[i] + " ");
        }

        for (int i = 0; i < InputArray.length - 1; i++) {
            for (int j = 0; j < InputArray.length - 1 - i; j++) {
                if (InputArray[j] > InputArray[j + 1]) {
                    temp = InputArray[j];
                    InputArray[j] = InputArray[j + 1];
                    InputArray[j + 1] = temp;
                    Enumerator++;
                }
            }

        }

        System.out.println("  Array  after sort:");
        for (int i = 0; i < InputArray.length; i++) {
            System.out.print(InputArray[i] + " ");
        }
        System.out.println("  Number of permutations " + Enumerator);
    }

    int BinarySearch(int Array[], int low, int high, int key) {
        int mid;

        if (low == high)
            return low;

        mid = low + ((high - low) / 2);

        if (key > Array[mid])
            return BinarySearch(Array, mid + 1, high, key);
        else if (key < Array[mid])
            return BinarySearch(Array, low, mid, key);

        return mid;
    }
    void  FractionSorting ()
    {
        System.out.println(" Enter the quantity fraction :");
        quantity = in.nextInt() ;
        List <Fraction> fs = new ArrayList<>();

        for ( int i = 1; i <= quantity; i++)
        {
           System.out.println("denominator " + i);
            denominator = in.nextInt();
            System.out.println("numerator " + i);
            numerator = in.nextInt();
         fs.add(new Fraction(denominator,numerator));
        }
       long lcd = fs.stream().mapToLong(f -> f.d).reduce(1, (d1, d2) -> d1 * d2 / gcd(d1, d2));
       fs.stream().map(f -> f.setLCD(lcd)).sorted(Fraction::sort).forEach(System.out::println);
    }
    static long gcd(long a, long b) {
        long tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    static class Fraction {
        long n, d; // numerator, denominator

        public Fraction(long n, long d) {
            this.n = n;
            this.d = d;
        }

        public Fraction setLCD(long lcd) {
            n *= (lcd / d);
            d = lcd;
            return this;
        }
        @Override
        public String toString() {
            return String.format("%d/%d", n, d);
        }
        public static int sort(Fraction f1, Fraction f2) {
            return Long.compare(f1.n, f2.n);
        }
    }
    private static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

}