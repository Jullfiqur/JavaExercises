package com.qa.Day2;

public class Results {

    public static void main(String[] args) {
        int Chemistry = 74;
        int Biology = 82;
        int Physics = 120;
        results(74, 82, 120);
        int total = Chemistry + Biology + Physics;
        System.out.println(total);
        // percentage(total * 100 / 450);
        //System.out.println(percentage(80));
    }
    public static int results(int Chemistry, int Biology, int Physics) {
        int total = Chemistry + Biology + Physics;
        System.out.println("You scored " + Chemistry + " in your Chemistry test!");
        System.out.println("You scored " + Biology + " in your Biology test!");
        System.out.println("You scored " + Physics + " in your Physics test!");
        System.out.println("You scored " + total + " out of a total 450 marks.");
        return total;
    }
    // public static int percentage(pertot) {
    //     int pertot = int total * 100 / 450 ;
    //     System.out.println(pertot);
    //     return pertot;
    // }

}