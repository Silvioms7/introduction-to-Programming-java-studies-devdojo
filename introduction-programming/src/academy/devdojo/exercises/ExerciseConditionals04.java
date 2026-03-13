// March 8, 2026
package academy.devdojo.exercises;

import java.util.Scanner;
public class ExerciseConditionals04 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, type your age: ");
        int age = input.nextInt();
        String category = null;
        if (age < 13) {
            category = "Kids";
        } else if (age >= 13 && age < 16) {
            category = "Juvenile";
        } else {
            category = "Adult";
        }
        System.out.println("You are a "+category);
        System.out.println("*Made by Silvio (I didn't copy).");
    }
}
