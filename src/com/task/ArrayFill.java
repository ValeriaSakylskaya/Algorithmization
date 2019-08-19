package com.task;

import java.util.Random;

public class ArrayFill {


    private Random random = new Random();

    public ArrayFill() {
    }

    void fillInt(int[] inputArray) {
        System.out.print("Received array: \n");

        for(int i = 0; i < inputArray.length; ++i) {
            inputArray[i] = (int)Math.round((float)this.random.nextInt(15));
            System.out.println(inputArray[i]);
        }

    }

    void fillFloat(double[] inputArray) {
        System.out.print("Received array: \n");

        for(int i = 0; i < inputArray.length; ++i) {
            inputArray[i] = (double)Math.round(Math.random() * 200.0D - 100.0D);
            System.out.println(inputArray[i]);
        }

    }
}
