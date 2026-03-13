// March 10, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseDoWhile01 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("type first number!");
            int firstNumber = input.nextInt();
            System.out.println("type second number!");
            int secondNumber = input.nextInt();
            if (firstNumber == secondNumber) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("continue or stop?");
            String option = input.next();

            switch (option) {
                case "continue"-> System.out.println("Okay!");
                default -> {
                    System.out.println("Okay, Completed program!");
                    return;
                }
            }
            System.out.println("*Made by Silvio (I didn't copy).");
        } while (true);

    }
}
