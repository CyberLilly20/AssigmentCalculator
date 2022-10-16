package se.lexicon;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            double num1, num2;
            Calculator.menu();

            System.out.println(" Choose an operator: +, -, *, /  ");
            String Type = scan.next();

            System.out.println(" Enter first number: ");
            num1 = scan.nextInt();

            System.out.println(" Enter second number: ");
            num2 = scan.nextInt();


            if (Type.equals("+") || Type.equals("plus")) {
                System.out.println(Calculator.addition(num1, num2));
            } else if (Type.equals("-")) {
                System.out.println(Calculator.subscription(num1, num2));
            } else if (Type.equals("*")) {
                System.out.println(Calculator.multiplication(num1, num2));
            } else if (Type.equals("/")) {
                System.out.println(Calculator.division(num1, num2));
            }
            System.out.println(" Do you want to continue? (Yes/No)  ");
            String continueOperation = scan.next();
            if (continueOperation.equalsIgnoreCase("No")) {
                System.out.println("Thank you for using calculator!" + " Bye Bye! ");

                break;
            }


        }
    }


}