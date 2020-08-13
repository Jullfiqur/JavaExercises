package com.qa.Day2;

public class calculator {

    public static void main(String[] args) {
        addition( 7, 21);
        multiplication(7,3);
        division(81, 9);
        subtraction(100, 73);
    }
    public static int addition (int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
        return result;
    }
    public static int multiplication(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
        return result;
    }
    public static double division(double num1, double num2) {
        double result = num1 / num2;
        System.out.println(result);
        return result;
    }
    public static int subtraction(int num1, int num2) {
        int result = num1 - num2;
        System.out.println(result);
        return result;
    }
}