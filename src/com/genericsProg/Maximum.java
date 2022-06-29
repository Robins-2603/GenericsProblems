package com.genericsProg;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("------Welcome to Generics problem program--------");

        //calling function of findMaxFromInteger
        Refactor2 compareInteger = new Refactor2(24,55,10);
        System.out.println("Maximum of Integers: " +  compareInteger.findMax());


        //calling function of findMaxFromString
        Refactor2 compareString = new Refactor2("apple","mango","banana");
        System.out.println("Maximum of Strings: " +  compareString.findMax());

        //calling function of findMaxFromFloat
        Refactor2 compareFloat = new Refactor2(80.5f, 25.33f,44.44f);
        System.out.println("Maximum of Floats: " +compareFloat.findMax());


    }



    // Creating  generic class
    static class Refactor2 <E extends Comparable<E>> {
        E a;
        E b;
        E c;

        //parameterizing constructor
        public Refactor2(E a, E b, E c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        // Creating function for finding maximum value of user input
        public E findMax() {

            E max = a;
            if (b.compareTo(max)>0)
                max = b;
            if(c.compareTo(max)>0)
                max = c;
            return max;
        }
    }
}