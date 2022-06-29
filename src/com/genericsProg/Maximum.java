package com.genericsProg;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("------Welcome to Generics problem program--------");

        //calling function of findMaxFromInteger
        System.out.println("Maximum of Integers: " +  Maximum.findMax(23,56,14));


        //calling function of findMaxFromString
        System.out.println("Maximum of Strings: " +Maximum.findMax("apple","mango","banana"));

        //calling function of findMaxFromFloat
        System.out.println("Maximum of Floats: " +Maximum.findMax(80.5f, 25.33f,44.44f));


    }

    // Creating function for finding maximum value of user input
    public static <E extends Comparable<E>> E findMax(E a, E b, E c) {

        E max = a;
        if (b.compareTo(max)>0)
            max = b;
        if(c.compareTo(max)>0)
            max = c;
        return max;
//        System.out.printf("Maximum"+E+"value "+ max);
//        System.out.println("");
//        System.out.println(max);

    }

//    public static void findMaxFromString(String string1, String string2, String string3 ) {
//
//        String max = string1;
//        if (string2.compareTo(max)>0)
//            max = string2;
//        if(string3.compareTo(max)>0)
//            max = string3;
//        System.out.printf("Maximum string Value from (%s, %s and %s): ",string1,string2,string3);
//        System.out.println("");
//        System.out.println(max);
//
//    }

//    public static void findMaxFromFloat(Float a, Float b, Float c ) {
//
//        Float max = a;
//        if (b.compareTo(max)>0)
//            max = b;
//        if(c.compareTo(max)>0)
//            max = c;
//        System.out.printf("Maximum float Value from (%f, %f and %f): ",a,b,c);
//        System.out.println("");
//        System.out.println(max);
//
//    }
}
