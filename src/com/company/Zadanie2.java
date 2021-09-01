package com.company;

public class Zadanie2 {

    public static int[] nextArray()
    {
        int[] array = new int[10];
        for(int i =0; i<array.length; i++)
        {
            System.out.println(array[i]);
            if(i == array.length-1)
                break;
            array[i+1] = array[i] + 10;
        }

        return array;
    }
}
