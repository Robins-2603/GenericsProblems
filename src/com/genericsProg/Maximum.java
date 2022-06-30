package com.genericsProg;

import java.lang.reflect.Array;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("------Welcome to Generics problem program--------");

        //calling function of findMaxFromInteger
        System.out.println("Finding the maximum value in integers:");
        Integer[] intValue = {5,10,51,15,87,20,61};
        MaxMore compareInteger = new MaxMore(intValue);
        compareInteger.display();
        System.out.println("Maximum of Integers: " +  compareInteger.findMax());


        //calling function of findMaxFromString
        System.out.println("Finding the maximum value String:");
        String[] strValue = {"apple","mango","banana","pineapple",};
        MaxMore compareString = new MaxMore(strValue);
        compareString.display();
        System.out.println("Maximum of Strings: " +  compareString.findMax());

        //calling function of findMaxFromFloat
        System.out.println("Finding the maximum value Float:");
        Float[] fltValue = {80.5f, 25.33f,44.44f,55.26f,88.36f};
        MaxMore compareFloat = new MaxMore(fltValue);
        compareFloat.display();
        System.out.println("Maximum of Floats: " +compareFloat.findMax());


    }



    // Creating  generic class for max more than three values
    static class MaxMore <E extends Comparable<E>> {
        private E[] value;  // declaring Array

        //parameterizing constructor

        public MaxMore(E[] value) {
            this.value = value;
        }
        //creating function for displaying the value
        public void display() {
            System.out.println("Before sorting");
            for(E element : value) {
                System.out.printf("%s", element + ",");

            }
            Arrays.sort(value);
            System.out.println();
            System.out.println("After sorting:");
            for(E element : value) {
                System.out.printf("%s", element + ",");
            }
        }

        // Creating function for finding maximum value of user input
        public E findMax() {

            int lengthOfArray = value.length;
            Arrays.sort(value);
            // last element will be max value
            E max = value[lengthOfArray-1];
            System.out.println(max);
            return max;

        }
    }
}