package com.company;

import static com.company.Zadanie4.*;

public class Main {

    public static void main(String[] args) {

        int integer1 = 100;
        double double1 = 23.3;
        long long1 = 21324;
        float float1 = 34324.34f;
        char char1 = 'm';

        String string1 = String.valueOf(integer1);
        String string2 = String.valueOf(double1);
        String string3 = String.valueOf(long1);
        String string4 = String.valueOf(float1);
        String string5 = String.valueOf(char1);

        integer1 = Integer.parseInt(string1);
        double1 = Double.parseDouble(string2);
        long1 = Long.parseLong(string3);
        float1 = Float.parseFloat(string4);
        char1 = string5.charAt(0);

        System.out.println(integer1);
        System.out.println(double1);
        System.out.println(long1);
        System.out.println(float1);
        System.out.println(char1);

       Zadanie2.nextArray();

       int[] array1 = {1,2,3,4};
       int[] array2 = {5,6,7,8};
       Zadanie3.doubleArrays(array1, array2);

       Zadanie4.totalRecall();

    }

}
