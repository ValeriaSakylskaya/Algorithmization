package com.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArrays {
    private Scanner in = new Scanner(System.in);

    public OneDimensionalArrays() {
    }

    /*1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.*/
    public int getSumOfElementsMultipleOfNumber(int[] array, int k) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % (double) k == 0.0D)
                sum = (sum + array[i]);
        }
        System.out.println("Result sum: " + sum);
        return sum;
    }

    /*2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
   числом. Подсчитать количество замен.*/
    public void replaceAllNumbersGreaterThanGivenNumberAndCountReplacements(double[] array, double numberToCompare) {
        int replacementsCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numberToCompare) {
                array[i] = numberToCompare;
                replacementsCount++;
            }
        }
        System.out.println("Replacements count: " + replacementsCount);
        System.out.println("Result array: " + Arrays.toString(array));
    }

    /*3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем
   положительных элементов.*/
    public int getCountOfPositiveElementsInArray(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                count++;
        }
        System.out.println("Count of positive elements in array " + count);
        return count;
    }

    /*  нулевых элементов.*/
    public int getCountOfNullElementsInArray(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0.0D)
                count++;
        }
        System.out.println("Count of null elements in array " + count);
        return count;
    }

    /*отрицательных элементов */
    public void showCountOfNegativeElementsInArray(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                count++;
        }
        System.out.println("Count of negative elements in array " + count);
    }

    /*4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.*/
    public void swapMaxAndMinElementsInArray(double[] array) {
        double maxElement = array[0];
        double minElement = array[0];
        int minIndex = 0;
        int maxIndex = 0;
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxIndex = i;
            }
            if (array[i] < minElement) {
                minElement = array[i];
                minIndex = i;
            }
        }
        System.out.print("Min element: " + minElement + "\n");
        System.out.print("Max element: " + maxElement + "\n");
        array[minIndex] = maxElement;
        array[maxIndex] = minElement;
        System.out.print("Result array: \n" + Arrays.toString(array));
    }

    /*5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.*/
    public void showArrayElementsGreaterThanIndex(int[] array) {
        System.out.println("Numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i)
                System.out.print(array[i] + ";");
        }
    }

    /*6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
    являются простыми числами.*/
    public void getSumOfArrayElementsWhichIndexesIsNaturalNumbers(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNaturalNumber(i))
                sum = sum + array[i];
        }
        System.out.println("Result sum: " + sum);
    }

    private boolean isNaturalNumber(int number) {
        for (int i = 0; i < number; i++) {
            if (number % i == 0)
                return false;
            if (i == number || (double) i > Math.sqrt((double) number))
                return true;
        }
        return false;
    }

    /*7. Даны действительные числа   a a an, , , 1 2. Найти max(a1 | a2n, a2 | a2n−1 ...,an + an+1)*/
    public void calculateMaxSumOfElementsInArrayByGivenSequence(int[] array) {
        int arrayLength = array.length;
        int maxSum;
        maxSum = array[0] + array[arrayLength - 1];
        for (int i = 1; i < arrayLength; ++i) {
            if (maxSum < array[i] + array[arrayLength - 2])
                maxSum = array[i] + array[arrayLength - 2];
            arrayLength--;
        }
        System.out.println("Max sum: " + maxSum);
    }

    /*8. Дана последовательность целых чисел a, a, an. Образовать новую последовательность, выбросив из  исходной те члены, которые равны
    min(a1, a2,...,an) */
    public ArrayList<Integer> SortArrayByGivenSequenceIntoResult(int[] array) {
        int minElement = array[0];
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement)
                minElement = array[i];
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] != minElement)
                resultList.add(array[j]);
        }
        return resultList;
    }

    /*9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
    чисел несколько, то определить наименьшее из них.*/
    public void getMostRepeatableNumberInArray(int Array[]) {
        int repeatsCountArray[] = new int[Array.length];
        int repeatableElements[] = new int[Array.length];
        int repeatsCount = 0;
        int countOfMostRepeatableElements = 0;
        int mostRepeatableElement = 0;
        int indexOfRepeatableElement = 0;
        for (int i = 0; i < Array.length; i++) {
            for (int j = i; j < Array.length; j++) {
                if (Array[i] == Array[j])
                    repeatsCount++;
            }
            repeatsCountArray[i] = repeatsCount;
            repeatsCount = 0;
        }
        for (int i = 0; i < repeatsCountArray.length; i++)
            if (repeatsCountArray[i] == 1)
                countOfMostRepeatableElements++;
        if (countOfMostRepeatableElements == repeatsCountArray.length)
            System.out.println("This array don`t have popular element");
        else {
            int max = repeatsCountArray[0];
            for (int i = 0; i < repeatsCountArray.length; i++) {
                if (max < repeatsCountArray[i]) {
                    max = repeatsCountArray[i];
                    indexOfRepeatableElement = i;
                }
            }
            for (int i = 0; i < repeatsCountArray.length; i++) {
                if (max == repeatsCountArray[i])
                    mostRepeatableElement++;
            }
            if (mostRepeatableElement == 1) {
                System.out.println("Number " + Array[indexOfRepeatableElement] + " meet " + max + " count");
            } else {
                for (int i = 0; i < repeatsCountArray.length; i++) {
                    if (repeatsCountArray[i] == max)
                        repeatableElements[i] = Array[i];
                }
                int min = repeatableElements[0];
                for (int i = 0; i < repeatableElements.length; i++) {
                    if (min > repeatableElements[i] && repeatableElements[i] != 0)
                        min = repeatableElements[i];
                }
                System.out.println("Number " + min + " meet " + max + " count");

            }
        }

    }

    /* 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
    элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.*/
    void CompressArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 2 == 0)
                array[i] = 0;
        }
        System.out.print("Compressed Array: \n");
        System.out.print(Arrays.toString(array));
    }
}
