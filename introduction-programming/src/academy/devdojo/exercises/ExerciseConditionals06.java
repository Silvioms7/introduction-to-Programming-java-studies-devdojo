// March 8, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseConditionals06 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, type your gender, M (Male) or F (Female): ");
        String gender = input.next();
        if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) {
        } else {
            System.out.println("Only 'M' for male or 'F' for female, restart."); return;
        }
        System.out.println("Now, type your age: ");
        int age = input.nextInt();
        if (age >= 18 && gender.equalsIgnoreCase("M")) {
            System.out.println("Mandatory Service.");
        } else if (age >= 18 && gender.equalsIgnoreCase("F")) {
            System.out.println("Would you like to enlist?");
        }if (age < 18) {
            System.out.println("Service not allowed for people under 18.");
        }
        System.out.println("*Made by Silvio (I didn't copy).");
    }
}
