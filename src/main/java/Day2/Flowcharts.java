package com.qa.Day2 ;

public class Flowcharts {

    public static void main(String[] args) {
        method1(7, 4, false);

    }
    public static void method1(int num1, int num2, boolean bool) {
        int sum = num1 + num2;
        int mult = num1 * num2;
        if (bool) {
            System.out.println(sum);
        } else {
            System.out.println(mult);
        }
    }
}