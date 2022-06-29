package com.genericsProg;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("------Welcome to Generics problem program--------");

        //calling function of findMaxFromInteger
        Maximum.findMaxFromInteger(23,56,14);
        //calling function of findMaxFromString
        Maximum.findMaxFromString("apple","mango","banana");
        //calling function of findMaxFromFloat
        Maximum.findMaxFromFloat(80.5f, 25.33f,44.44f);

    }

    // Creating function for finding maximum value of user input
    public static void findMaxFromInteger(Integer a, Integer b, Integer c) {

        int max = a;
        if (b.compareTo(max)>0)
            max = b;
        if(c.compareTo(max)>0)
            max = c;
        System.out.printf("Maximum integer Value from (%d, %d and %d): ",a,b,c);
        System.out.println("");
        System.out.println(max);

    }

    public static void findMaxFromString(String string1, String string2, String string3 ) {

        String max = string1;
        if (string2.compareTo(max)>0)
            max = string2;
        if(string3.compareTo(max)>0)
            max = string3;
        System.out.printf("Maximum string Value from (%s, %s and %s): ",string1,string2,string3);
        System.out.println("");
        System.out.println(max);

    }

    public static void findMaxFromFloat(Float a, Float b, Float c ) {

        Float max = a;
        if (b.compareTo(max)>0)
            max = b;
        if(c.compareTo(max)>0)
            max = c;
        System.out.printf("Maximum float Value from (%f, %f and %f): ",a,b,c);
        System.out.println("");
        System.out.println(max);

    }
}
