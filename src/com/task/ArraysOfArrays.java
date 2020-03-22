package com.task;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysOfArrays {
    private Scanner in = new Scanner(System.in);
    private DecompositionUsingMethods numberHelper = new DecompositionUsingMethods();
    private DecimalFormat decimalFormat = new DecimalFormat("00.00");

    /*1. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.*/
    public void printOddColumns(int[][] matrix) {
        System.out.println("New matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((j + 1) % 2 != 0 & matrix[0][j] > matrix[matrix.length - 1][j])
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    /*2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.*/
    public void printDiagonalElementsOfSquareMatrix(int[][] matrix) {
        System.out.println("Diagonal elements:  ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j)
                    System.out.print(matrix[i][j] + ";");
            }
        }
    }

    /* 3.Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/
    public void printRowAndColumnInMatrix(int[][] matrix, int inputRow, int inputColumn) {
        System.out.print("Row: ");
        for (int j = 0; j < matrix[inputRow - 1].length; j++) {
            System.out.print(matrix[inputRow - 1][j] + ";");
        }
        System.out.print("Column: \n");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][inputColumn - 1] + "\n");
        }
    }

    /*4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
   (1  2   3 ...n)
   (n n-1 n-2...1)
   (1  2   3 ...n)
   (n n-1 n-2...1)
   (.............)
   (n n-1 n-2...1)*/
    public void createMatrixBySequenceEvenN() {
        System.out.print("Enter an even number: ");
        int index = in.nextInt();
        if (numberHelper.isEvenNumber(index) == false)
            System.out.print("You entered an odd number:\n");
        int[][] matrix = new int[index][index];
        int evenValue = index;
        int oddValue = 1;
        for (int i = 0; i < matrix.length; i++) {
            if ((i + 1) % 2 != 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = oddValue;
                    oddValue++;
                }
                oddValue = 1;
            } else {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = evenValue;
                    evenValue = evenValue - 1;
                }
                evenValue = index;
            }
        }
        System.out.print("Result matrix: \n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print(" \n");
        }
    }

    /*5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
   (1 1   1 ...1 1 1)
   (2 2   2 ...2 2 0)
   (3 3   3 ...3 0 0)
   (................)
   (n n-1 0... 0 0 0)
   (n 0   0... 0 0 0)*/
    public void createMatrixBySequenceReplaceLastElementsOnZero() {
        System.out.print("Enter an even number: ");
        int index = in.nextInt();
        if (numberHelper.isEvenNumber(index) == false)
            System.out.print("You entered an odd number");
        int[][] matrix = new int[index][index];
        int evenValue = index;
        int oddValue = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j < evenValue)
                    matrix[i][j] = oddValue;
                else
                    matrix[i][j] = 0;
            }
            oddValue++;
            evenValue = evenValue - 1;
        }
        System.out.print("Result matrix: \n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print(" \n");
        }
    }

    /*6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
   (1 1 1...1 1 1)
   (0 1 1...1 1 0)
   (0 0 1...1 0 0)
   (.............)
   (0 1 1...1 1 0)
   (1 1 1...1 1 1)*/
    public void createMatrixBySequenceOnZeroAndOne() {
        System.out.print("Enter even number ");
        int index = in.nextInt();
        if (numberHelper.isEvenNumber(index) == false)
            System.out.print("You entered an odd number");
        int[][] fillMatrix = new int[index][index];
        int middleMatrix = fillMatrix.length / 2;
        int evenValue = fillMatrix.length;
        int oddValue = 0;
        for (int i = 0; i < middleMatrix; i++) {
            for (int j = 0; j < fillMatrix.length; j++) {
                if (j < evenValue && j >= i)
                    fillMatrix[i][j] = 1;
                else
                    fillMatrix[i][j] = 0;
            }
            evenValue--;
            oddValue++;
        }
        evenValue = fillMatrix.length;
        oddValue = 0;
        for (int i = fillMatrix.length - 1; i >= middleMatrix; i--) {
            for (int j = 0; j < fillMatrix.length; j++) {
                if (j < evenValue & j > oddValue - 1)
                    fillMatrix[i][j] = 1;
                else
                    fillMatrix[i][j] = 0;
            }
            evenValue--;
            oddValue++;
        }
        System.out.print("Result matrix: \n");
        for (int i = 0; i < fillMatrix.length; i++) {
            for (int j = 0; j < fillMatrix[i].length; j++) {
                System.out.print(fillMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }


    /*7. Сформировать квадратную матрицу порядка N по правилу: и подсчитать количество положительных элементов в ней.
    A[i:j] = sin ((i^2 - j^2)/N)*/
    void createMatrixBySequenceOnSinus() {
        int index;
        System.out.print("Enter an even number: ");
        index = in.nextInt();
        double[][] matrix = new double[index][index];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Math.sin(((i * i) - (j * j)) / index);
            }
        }
        System.out.print("Fill matrix \n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(decimalFormat.format(matrix[i][j]) + " ");
            }
            System.out.print(" \n");
        }
        System.out.print("Count of positive elements:\n" + getCountOfPositiveElementsInMatrix(matrix));
    }

    public int getCountOfPositiveElementsInMatrix(double[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > 0)
                    sum++;
            }
        }
        return sum;
    }

    /*8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
     на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
     пользователь с клавиатуры.*/
    public void swapColumnsInMatrix(int[][] matrix) {
        int inputColumn = 0;
        int swapColumn = 0;
        System.out.println("\n Enter column: ");
        inputColumn = in.nextInt() - 1;
        System.out.println("\n Enter column: ");
        swapColumn = in.nextInt() - 1;
        for (int i = 0; i < matrix.length; i++) {
            int swapElement = matrix[i][inputColumn];
            matrix[i][inputColumn] = matrix[i][swapColumn];
            matrix[i][swapColumn] = swapElement;
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print(" \n");
        }
    }

    /*9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
    столбец содержит максимальную сумму.*/
    public void getColumnWithMaxOfSumElements(int[][] matrix) {
        int maxColumnSum = 0;
        int sum = 0;
        for (int j = 0; j < matrix[1].length; j++) {
            sum = calculateColumnSumInMatrix(matrix, j);
            System.out.println("Column sum " + (j + 1) + ": " + sum);
            if (maxColumnSum < sum)
                maxColumnSum = sum;
        }
        System.out.println("Max Sum: " + maxColumnSum);
    }

    /* подсчет суммы стоблца матрицы*/
    private int calculateColumnSumInMatrix(int[][] matrix, int columnIndex) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][columnIndex];
        }
        return sum;
    }

    /*10. Найти положительные элементы главной диагонали квадратной матрицы.*/
    public ArrayList<Integer> getPositiveElementsOfMainDiagonal(int[][] matrix) {
        ArrayList<Integer> positiveElements = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j & matrix[i][j] > 0)
                    positiveElements.get(matrix[i][j]);
            }
        }
        return positiveElements;
    }

    /*11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
    которых число 5 встречается три и более раз.*/
    public void fillMatrixByRandomNumbers() {
        int range = 15;
        int columnCount = 15;
        int rowCount = 20;
        int count = 0;
        int[][] matrix = new int[columnCount][rowCount];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * range);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print(" \n");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5)
                    count++;
            }
            if (count >= 3)
                System.out.print("Row numbers in\n" +
                        "     which the number 5 occurs three or more times :" + (i + 1));
        }
    }
    /*12. Отсортировать строки матрицы по убыванию */

    public void sortByDescendingRow(int[][] matrix) {
        int temp = 0;
        System.out.print("\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = j + 1; k < matrix[i].length; k++) {
                    if (matrix[i][j] < matrix[i][k]) {
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    /* и возрастанию значений элементов.*/
    public void sortByAscendingRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Arrays.sort(matrix[i]);
            }
        }
        System.out.print("\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    /*13. Отсотрировать стобцы матрицы по возрастанию*/
    public void sortMatrixByAscendingColumn(int[][] matrix, int row, int column) {
        int temp = 0;
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row; i++) {
                for (int k = i + 1; k < row; k++) {
                    if (matrix[i][j] > matrix[k][j]) {
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[k][j];
                        matrix[k][j] = temp;
                    }
                }
            }
        }

        System.out.print("\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    /* и убыванию значений эементов.*/
    public void sortMatrixByDescendingColumn(int[][] matrix, int row, int column) {
        int temp = 0;
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row; i++) {
                for (int k = i + 1; k < row; k++) {
                    if (matrix[i][j] < matrix[k][j]) {
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[k][j];
                        matrix[k][j] = temp;
                    }
                }
            }
        }

        System.out.print("\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    /*14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
    единиц равно номеру столбца.*/
    public void fillMatrixByOneNull() {
        int inputRow = 0;
        System.out.print("Enter row: ");
        inputRow = in.nextInt();
        int[][] fillMatrix = new int[inputRow][inputRow];
        for (int j = 0; j < fillMatrix.length; j++) {
            int temp = 0;
            for (int i = 0; i < fillMatrix[j].length; i++) {
                fillMatrix[i][j] = (int) (Math.round(Math.random()));
                if (fillMatrix[i][j] != 0) {
                    if (temp < j + 1)
                        temp++;
                    else
                        fillMatrix[i][j] = 0;
                }
            }
        }
        System.out.print(" Fill matrix: \n");
        for (int i = 0; i < fillMatrix.length; i++) {
            for (int j = 0; j < fillMatrix[i].length; j++) {
                System.out.print(fillMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }


    /*15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.*/
    private void replaceOfOddElementsWithMax(int[][] matrix) {
        int maxElement = searchMaxElementInMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0 || matrix[i][j] == 0)
                    matrix[i][j] = maxElement;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    private int searchMaxElementInMatrix(int[][] matrix) {
        int maxElement = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxElement < matrix[i][j]) {
                    maxElement = matrix[i][j];
                }
            }
        }
        System.out.println("Max element: " + maxElement);
        return maxElement;
    }

    /*16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,...,n
    так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
    собой. Построить такой квадрат. Пример магического квадрата порядка 3:*/
    void buildMagicSquare() {
        int inputRow = 0;
        int temp = 1;
        System.out.println(" enter the size");
        inputRow = in.nextInt();
        int[][] magicSquare = new int[inputRow][inputRow];
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                magicSquare[i][j] = temp;
                temp++;
            }
        }
        int randomColumn = 0;
        int randomColumnSecond = 0;
        int randomRowSecond = 0;
        int randomRow = 0;
        while (checkSumRowMagic(magicSquare) != true || checkSumColumnMagic(magicSquare) != true || checkSumDiagonal(magicSquare) != true) {
            randomColumn = (int) Math.round((Math.random() * (inputRow - 1)));
            randomRow = (int) Math.round((Math.random() * (inputRow - 1)));
            randomColumnSecond = (int) Math.round((Math.random() * (inputRow - 1)));
            randomRowSecond = (int) Math.round((Math.random() * (inputRow - 1)));
            temp = magicSquare[randomRow][randomColumn];
            magicSquare[randomRow][randomColumn] = magicSquare[randomRowSecond][randomColumnSecond];
            magicSquare[randomRowSecond][randomColumnSecond] = temp;
        }
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[i].length; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    private boolean checkSumDiagonal(int[][] matrix) {
        int sumOfTheFirstDiagonal = 0;
        int length = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j)
                    sumOfTheFirstDiagonal = sumOfTheFirstDiagonal + matrix[i][j];
            }
        }
        int sumOfTheSecondDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {

            sumOfTheSecondDiagonal = sumOfTheSecondDiagonal + matrix[i][length];
            length--;
        }
        return sumOfTheFirstDiagonal == sumOfTheSecondDiagonal;
    }

    private boolean checkSumRowMagic(int[][] matrix) {
        int allSum = 0;
        int length = matrix.length;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                allSum = allSum + matrix[i][j];
            }
        }
        int rowSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                rowSum = rowSum + matrix[i][j];
            }
            if (allSum / length == rowSum)
                count++;
            rowSum = 0;
        }
        return count == length;
    }

    private boolean checkSumColumnMagic(int[][] matrix) {
        int sumColumn = 0;
        int allSum = 0;
        int length = matrix.length;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                allSum = allSum + matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sumColumn = sumColumn + matrix[j][i];
            }
            if (allSum / length == sumColumn)
                count++;
            sumColumn = 0;
        }
        return count == length;
    }
}





