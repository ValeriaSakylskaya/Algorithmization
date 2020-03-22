package com.task;

import java.util.Arrays;
import java.util.Random;

public class DecompositionUsingMethods {


    /*  1. Написать метод(методы) для нахождения наибольшего общего делителя */
    public int getGreatestCommonDivisor(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int getGreatestCommonDivisor(int array[]) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = getGreatestCommonDivisor(result, array[i]);
        }
        return result;
    }

    /* и наименьшего общего кратного двух
     натуральных чисел:*/
    public int getLeastCommonMultiple(int a, int b) {
        return a * (b / getGreatestCommonDivisor(a, b));
    }

    /*2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел*/
    public int MaxCommonDenominator4Numbers(int a, int b, int c, int d) {
        int [] array = {a, b, c, d};
        int maxDenominator = getGreatestCommonDivisor(array);
        return maxDenominator;
    }

    private int getMinNumber(int a, int b, int c, int d) {
        if (a < b && a < c && a < d)
            return a;
        else if (b < a && b < c && b < d)
            return b;
        else if (c < a && c < b && c < d)
            return c;
        else
            return d;

    }

    /*3. Вычислить площадь правильного шестиугольника со стороной а*/
    public double getSquareHexagon(double side) {
        double square;
        square = 6 * getSquareTriangle(side);
        return square;
    }

    /*, используя метод вычисления площади  треугольника.*/
    private double getSquareTriangle(double sideOfTriangle) {
        double squareTriangle;
        squareTriangle = ((3 * Math.sqrt(sideOfTriangle)) / 2) * Math.pow(sideOfTriangle, 2);
        return squareTriangle;
    }

    /*4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
        из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.*/
    public int[][] LargestDistanceBetweenPointCoordinates(int Array[][]) {
        double maxDistance = 0;
        int coordinatesWithLargestDistance[][] = new int[2][2];
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                if (maxDistance < getDistanceBetweenCoordinates(Array[i][0], Array[i][1], Array[j][0], Array[j][1])) {
                    maxDistance = getDistanceBetweenCoordinates(Array[i][0], Array[i][1], Array[j][0], Array[j][1]);
                    coordinatesWithLargestDistance[0][0] = Array[i][0];
                    coordinatesWithLargestDistance[0][1] = Array[i][1];
                    coordinatesWithLargestDistance[1][0] = Array[j][0];
                    coordinatesWithLargestDistance[1][1] = Array[j][1];
                }
            }
        }
        return coordinatesWithLargestDistance;
    }

    /*поиск расстояния между координатами */
    private double getDistanceBetweenCoordinates(int x1, int y1, int x2, int y2) {
        double distance;
        distance = Math.hypot(x1 - x2, y1 - y2);
        return distance;
    }

    /*5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
        которое меньше максимального элемента массива, но больше всех других элементов).*/
    public void getSecondMaxElement(int array[]) {
        int secondMaxElement = 0;
        int firstMaxElement = getMaxElement(array);
        for (int i = 0; i < array.length; i++) {
            if (secondMaxElement < array[i] && array[i] != firstMaxElement)
                secondMaxElement = array[i];
        }
        System.out.print(secondMaxElement);
    }

    /* поиск максимального значения*/
    private int getMaxElement(int array[]) {
        int maxElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i])
                maxElement = array[i];
        }
        return maxElement;
    }

    /*6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.*/
    public boolean isNumbersAreCoprime(int a, int b, int c) {
        if (getGreatestCommonDivisor(a, b) == 1 && getGreatestCommonDivisor(a, c) == 1 && getGreatestCommonDivisor(c, b) == 1)
            return true;
        else
            return false;
    }

    /*7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9*/
    public int getFactorialOfOddNumbers() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0)
                sum += calculateFactorial(i);
        }
        return sum;
    }

    /* расчет факториала числа*/
    private int calculateFactorial(int x) {
        if (x == 1)
            return 1;
        return x * calculateFactorial(x - 1);
    }

    /*8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
    Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
    массива с номерами от k до n*/
    public int getSumThreeElementsFromSection(int Array[], int k, int n) {
        int sum = 0;
        if (n + 2 <= Array.length) {
            for (int i = k; i <= n; i++) {
                sum = sum + getSumOfThreeConsecutiveElements(Array, i);
            }
        } else System.out.println(" error the enter n");
        return sum;
    }

    /* расчет суммы трех последовательно расположенных элементов*/
    private int getSumOfThreeConsecutiveElements(int Array[], int i) {
        int sum = 0;
        sum = Array[i] + Array[i + 1] + Array[i + 2];
        return sum;
    }

    /*9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
        если угол между сторонами длиной X и Y— прямой.*/
    public double calculateSquareQuadrangle(int sideX, int sideY, int sideZ, int sideT) {
        double square, squareFirstPartOfQuadrangle, squareSecondPartOfQuadrangle, diagonal;
        diagonal = calculateDiagonal(sideX, sideY);
        squareFirstPartOfQuadrangle = (sideX * sideY) / 2;
        squareSecondPartOfQuadrangle = 0.25 * Math.sqrt((diagonal + sideZ + sideT) * (diagonal + sideZ - sideT) * (diagonal + sideT - sideZ) * (sideT + sideZ - diagonal));
        square = squareFirstPartOfQuadrangle + squareSecondPartOfQuadrangle;
        return square;
    }

    /*расчет длины диагонали*/
    private double calculateDiagonal(int sideX, int sideY) {
        double diagonal;
        diagonal = Math.sqrt(sideX * sideX + sideY * sideY);
        return diagonal;
    }

    /*10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
    являются цифры числа N.*/
    public int[] createArrayFromNumber(int number) {
        int arraySize = getCountOfDigits(number);
        int array[] = new int[arraySize];
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = number % 10;
            number /= 10;
        }
        return array;
    }

    private int getCountOfDigits(long number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;

    }

    /*11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр*/
    public String getNumberWithMoreDigits(long fistNumber, long secondNumber) {
        int countFirst, countSecond;
        countFirst = getCountOfDigits(fistNumber);
        countSecond = getCountOfDigits(secondNumber);
        if (countFirst > countSecond)
            return fistNumber + " number has more digits";
        if (countFirst == countSecond)
            return "Numbers are equal";
        if (countFirst < countSecond)
            return secondNumber + " number has more digits";
        return "Unknown error";
    }

    /*12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
        являются числа, сумма цифр которых равна К и которые не большее N.*/
    public void createArrayByCondition(int array[], int k, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomNumbers(k, n);
        }
        System.out.print(Arrays.toString(array));

    }

    private int getRandomNumbers(int k, int n) {
        Random random = new Random();
        int randomNumber = 0;
        while (getSumOfDigitsFromNumber(randomNumber) != k) {
            randomNumber = random.nextInt(n);
        }
        return randomNumber;
    }

    private int getSumOfDigitsFromNumber(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + (number % 10);
            number /= 10;
        }
        return sum;
    }

    /*13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
    Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
    решения задачи использовать декомпозицию.*/
    public void printPairOfTwinsFromNaturalNumber(int number) {
        for (int i = number; i < (2 * number - 2); i++) {
            if (checkingNumbersForTwins(i) && checkingNumbersForTwins(i + 2))
                System.out.println("(" + i + ";" + (i + 2) + ") ");
        }
    }

    private boolean checkingNumbersForTwins(int number) {
        int count = 0;
        for (int i = 1; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (i == Math.sqrt(number))
                    count++;
                else count += 2;
            }
        }
        if (count == 2) return true;//если число простое
        else return false;//если число составное
    }

    /*14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
    возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
    использовать декомпозицию.*/
    public void findAllArmstrongNumbers(double n) {
        for (int i = 1; i <= n; i++) {
            if (isArmstrongNumber(i))
                System.out.println(i);
        }
    }

    private boolean isArmstrongNumber(int n) {
        int sum = 0, temp = n, remainder, digits = 0;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        temp = n;
        while (temp != 0) {
            remainder = temp % 10;
            sum = sum + (int) Math.pow(remainder, digits);
            temp = temp / 10;
        }
        if (n == sum)
            return true;
        else
            return false;
    }

    /*15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
        последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.*/
    public void searchAllNumbersWhoseDigitsFormAscendingSequence(int n) {
        for (int i = 1; i <= (10 - n); i++) {
            System.out.println(createAscendingSequence(i, n) + "  ");
        }
    }

    private int createAscendingSequence(int i, int n) {
        double number = 0;
        int size = n - 1;
        for (int j = 1; j <= n; j++) {
            number = number + i * (Math.pow(10, size));
            size--;
            i++;
        }
        return (int) number;
    }

    /*16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
    Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.*/
    public void searchSumOfOddNumbers(int n) {
        int firstElement = 0;
        int sum = 0;
        if (n == 1)
            firstElement = 1;
        else
            firstElement = (int) Math.pow(10, n - 1);
        for (int i = firstElement; i < (int) Math.pow(10, n); i++) {
            if (isOddNumber(i))
                sum = sum + i;
        }
        System.out.println("Sum of elements:  " + sum);
        System.out.println("Count of even numbers: " + getCountEvenNumbers(sum));
    }

    private boolean isOddNumber(int n) {
        while (n != 0) {
            if ((n % 10) % 2 == 0)
                return false;
            n /= 10;
        }
        return true;
    }
    public    boolean isEvenNumber(int n){
        if(n % 2 == 0)
            return true;
        return false;
    }
    private int getCountEvenNumbers(int n) {
        int count = 0;
        while (n != 0) {
            if (isEvenNumber(n % 10) )
                count++;
            n /= 10;
        }
        return count;
    }

    /*17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
    действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/
    public void performSubtractionsToGetZeroValue(int n) {
        int countIteration = 0;
        while (n != 0) {
            n = n - getSumOfDigitsFromNumber(n);
            countIteration++;
        }
        System.out.println("Count iteration: " + countIteration);
    }
}
