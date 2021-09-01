package com.company;

public class Zadanie3 {

    public static int[] doubleArrays(int[] left, int[] right)
    {
        int[] newArray = new int[left.length + right.length];

        for(int i = 0; i<left.length; i++)
        {
          newArray[i] = left[i];
        }

        for(int i=left.length; i<newArray.length; i++)
        {
            newArray[i] = right[i-left.length];
        }

        for(int i = 0; i<newArray.length; i++)
        {
            System.out.println(newArray[i]);
        }

        return newArray;
    }
}


