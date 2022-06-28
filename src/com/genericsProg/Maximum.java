package com.genericsProg;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("------Welcome to Generics problem program--------");
        // importing scanner for user input
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer c = sc.nextInt();

        //storing user input in Array named numb
        Integer[] numb = new Integer[]{a,b,c};

        //calling function of findMaxFromInteger
        Maximum.findMaxFromInteger(numb);

    }

    // Creating function for finding maximum value of user input
    public static void findMaxFromInteger(Integer []numb) {

        Integer max = numb[0];
        if (numb[1].compareTo(max)>0)
            max = numb[1];
        if(numb[2].compareTo(max)>0)
            max = numb[2];
        System.out.println("Maximum number is " +max);

    }
}
