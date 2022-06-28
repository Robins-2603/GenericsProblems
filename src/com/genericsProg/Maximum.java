package com.genericsProg;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("------Welcome to Generics problem program--------");
        // importing scanner for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integers you want to check");
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer c = sc.nextInt();
// for string type input
        System.out.println("Enter the Strings you want to check");
        String d = sc.next();
        String e = sc.next();
        String f = sc.next();

        //storing user input in Array named numb
        Integer[] numb = new Integer[]{a,b,c};
        //storing user input in Array named str
        String[] str = new String[]{d,e,f};

        //calling function of findMaxFromInteger
        Maximum.findMaxFromInteger(numb);
        //calling function of findMaxFromString
        Maximum.findMaxFromString(str);

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

    public static void findMaxFromString(String []numb) {

        String max = numb[0];
        if (numb[1].compareTo(max)>0)
            max = numb[1];
        if(numb[2].compareTo(max)>0)
            max = numb[2];
        System.out.println("Maximum Value string is " +max);

    }
}
