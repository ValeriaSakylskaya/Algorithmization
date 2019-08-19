package com.task;

public class FillMatrix {

    void Fill(  int FillArray[][])
    {
        for( int i = 0; i < FillArray.length; i ++)
        {
            for (int j = 0; j < FillArray[i].length; j ++)
            {
                FillArray[i][j] = (int)(Math.random()*10.00);
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
}
