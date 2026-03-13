// March 10, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseFor03 {
    static void main(String[] args) {
        // multiplication table
        Scanner input = new Scanner(System.in);
        System.out.println("Which multiplication table would you like (1 - 12)? ");
        int answer = input.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " x " + answer + " = " + (i * answer));
        }
        System.out.println("*Made by Silvio (I didn't copy).");
    }
}
