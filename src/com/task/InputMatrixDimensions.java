package com.task;

import java.util.Scanner;

public class InputMatrixDimensions {

    private Scanner in= new Scanner(System.in);
    void setColumnRow(int column , int row)
    {
        System.out.print(" Enter the number of columns ");
        column = in.nextInt();
        System.out.print(" Enter the number of row ");
        row = in.nextInt();
       // System.out.print( row+" matrix"+ column);
        in.close();
    }
    void setSquareMatrix (int row)
    {
        System.out.print(" Enter the number of columns square matrix");
        row = in.nextInt();
        in.close();
    }
}
