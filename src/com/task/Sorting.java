package com.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Sorting {

    Scanner in = new Scanner(System.in);

    /*1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
   один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
   дополнительный массив.*/
    public void combineTwoArraysIntoOne(ArrayList firstArray, ArrayList secondArray) {
        int index = 0;
        System.out.println("\nEnter the element from which you want to start joining ");
        index = in.nextInt();
        for (int i = 0; i < secondArray.size(); i++) {
            firstArray.add(index, secondArray.get(i));
            index++;
        }
        System.out.println("New  array:" + firstArray);
    }


    /*2. Даны две последовательности
    a1 <= a2 <=…<=an   и b1<=b2<=…<=bm
    . Образовать из них новую последовательность
    чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.*/
    public void combineTwoArraysInNonDecreasingSequence(ArrayList firstArray, ArrayList secondArray) {
        Collections.sort(firstArray);
        Collections.sort(secondArray);
        for (int i = 0; i < secondArray.size(); i++) {
            firstArray.add(secondArray.get(i));
        }
        Collections.sort(firstArray);
        System.out.println("\nNew  array :" + firstArray);

    }

    /*3. Сортировка выбором. Дана последовательность чисел
    a1 <= a2 <=…<=an
    .Требуется переставить элементы так,
    чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
    элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
    повторяется. Написать алгоритм сортировки выбором.*/
    void sortArrayBySelectionSort(int[] array) {
        int maxElementId = 0;
        int swappedElement = 0;
        System.out.print("Enter the size  array ");
        System.out.println("Array  before sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            maxElementId = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[maxElementId])
                    maxElementId = j;

            }
            swappedElement = array[i];
            array[i] = array[maxElementId];
            array[maxElementId] = swappedElement;
        }
        System.out.println("\n Array  after sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /*4. Сортировка обменами. Дана последовательность чисел
    a1 <= a2 <=…<=an
.Требуется переставить числа в
    порядке возрастания. Для этого сравниваются два соседних числа
  ai  и ai+1     . Если   ai > ai+1    , то делается    перестановка.
     Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
    Составить алгоритм сортировки, подсчитывая при этом количества перестановок.*/

    void sortMatrixByExchangeSorting(int[] array) {
        int swappedElement = 0;
        int enumerator = 0;
        System.out.println("Array  before sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swappedElement = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swappedElement;
                    enumerator++;
                }
            }
        }
        System.out.println("Array  after sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Number of permutations " + enumerator);
    }


    /*5. Сортировка вставками. Дана последовательность чисел
     a1 , a2 …an. Требуется переставить числа в порядке
    возрастания. Делается это следующим образом. Пусть a1,a2,…,ai- упорядоченная последовательность,
     a1 <= a2 <=…<=a1
    . Берется следующее число ai+1
    и вставляется в последовательность так, чтобы новая
    последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
    не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
    с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
    */
    void sortArrayByInsertionSort(int[] array) {
        int index = 0;
        int swappedElement = 0;
        System.out.println("Array  before sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 1; i < array.length; i++) {
            index = performBinarySearchIntoResult(array, 0, i, array[i]);
            if (index < i) {
                swappedElement = array[i];
                for (int j = i - 1; j >= index; j--)
                    array[j + 1] = array[j];
                array[index] = swappedElement;
            }
        }
        System.out.println("Array  after sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /* бинарный поиск*/
    private int performBinarySearchIntoResult(int Array[], int bottomElementIndex, int topElementIndex, int key) {
        int middleElementIndex;
        if (bottomElementIndex == topElementIndex)
            return bottomElementIndex;
        middleElementIndex = bottomElementIndex + ((topElementIndex - bottomElementIndex) / 2);
        if (key > Array[middleElementIndex])
            return performBinarySearchIntoResult(Array, middleElementIndex + 1, topElementIndex, key);
        else if (key < Array[middleElementIndex])
            return performBinarySearchIntoResult(Array, bottomElementIndex, middleElementIndex, key);
        return middleElementIndex;
    }

    /*6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
    Делается это следующим образом: сравниваются два соседних элемента
    ai и ai+1. Если ai <= ai+1 , то продвигаются
    на один элемент вперед. Если ai > ai+1
    , то производится перестановка и сдвигаются на один элемент назад.
    Составить алгоритм этой сортировки.
    */
    void sortArrayBySortShell(int[] matrix) {
        int swappedElement = 0;
        System.out.println("Array  before sort:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }
        int j = 0;
        while ((j + 1) < matrix.length)
            if (matrix[j] > matrix[j + 1]) {
                swappedElement = matrix[j];
                matrix[j] = matrix[j + 1];
                matrix[j + 1] = swappedElement;
                if (j > 0)
                    j--;
            } else
                j++;
        System.out.println("\n Array  after sort:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }
    }
/*7. Пусть даны две неубывающие последовательности действительных чисел
 a1 <= a2 <=…<=an   и b1<=b2<=…<=bm.
Требуется указать те места, на которые нужно вставлять элементы последовательности
b1<=b2<=…<=bm.В первую последовательность так, чтобы новая последовательность оставалась возрастающей.*/

    void SearchForInsertionPlace(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray) {
        ArrayList<Integer> indexArray = new ArrayList<Integer>();
        Collections.sort(firstArray);
        Collections.sort(secondArray);
        System.out.println(" Second array :" + secondArray);
        for (int i = 0; i < secondArray.size(); i++) {
            int tem = Collections.binarySearch(firstArray, secondArray.get(i));
            if (tem < 0) indexArray.add(-(tem + 1) + i);
            else indexArray.add(tem + i);
        }
        System.out.println("Index for insert :" + indexArray);
        for (int i = 0; i < indexArray.size(); i++) {
            firstArray.add(indexArray.get(i), secondArray.get(i));
        }
        System.out.println("После вставки " + firstArray);
    }


/*8.Даны дроби  Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.*/

    public void sortFraction() {
        int quantityFractions = 0;
        System.out.println(" Enter the quantity fraction :");
        quantityFractions = in.nextInt();
        List<Fraction> fs = new ArrayList<>();
        int denominator = 0;
        int numerator = 0;
        for (int i = 1; i <= quantityFractions; i++) {
            System.out.println("denominator " + i);
            denominator = in.nextInt();
            System.out.println("numerator " + i);
            numerator = in.nextInt();
            fs.add(new Fraction(denominator, numerator));
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