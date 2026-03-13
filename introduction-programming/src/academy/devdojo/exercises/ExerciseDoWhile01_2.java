// March 10, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseDoWhile01_2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte option = 1;
        do {
            System.out.println("type first number!");
            int firstNumber = input.nextInt();
            System.out.println("type second number!");
            int secondNumber = input.nextInt();
            System.out.println("Are the number equal? " + (firstNumber == secondNumber));
            System.out.println("-------------------------\n" + "Would you like to continue playing?\n" + "1. Yes\n" + "2. No");
            option = input.nextByte();

        } while (option == 1);
        System.out.println("Completed program!");
    }
}
