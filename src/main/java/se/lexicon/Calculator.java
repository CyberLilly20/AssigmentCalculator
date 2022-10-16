package se.lexicon;

import java.util.Scanner;

public class Calculator {

    public static void menu() {

        System.out.println("¤¤¤ Welcome to Basic Calculator ¤¤¤");
        System.out.println("The following operations are supported :");
        System.out.println(" Addition " + "+");
        System.out.println(" Subscription" + "-");
        System.out.println(" Multiplication" + "*");
        System.out.println(" Division" + "/");

    }


    public static double addition(double num1, double num2) {
        return num1 + num2;
    }
    public static double subscription(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }
    public static double division(double num1, double num2) {
        return num1 / num2;
    }


}
