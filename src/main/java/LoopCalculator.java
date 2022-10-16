import se.lexicon.Calculator;

import java.util.Scanner;

public class LoopCalculator {

    public static void mein(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Wold you like to continue? Yes/ No ");
            String continueOperation = scan.next();
            int answer = scan.nextInt();
            if (continueOperation.equalsIgnoreCase("No")) {
                System.out.println("Thank you for using calculator" + "Bye Bye");
            }
        }
    }
}