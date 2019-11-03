package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String in = input.next().toString();
        StringBuffer buffer = new StringBuffer(in);
        String str = buffer.toString().toUpperCase();
        System.out.println("UpperCase= " + str);
        String str1 = str.toLowerCase();
        System.out.println("LowerCase= " + str1);
    }
}