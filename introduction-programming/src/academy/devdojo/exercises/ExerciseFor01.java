// March 10, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseFor01 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number!");
        int number = input.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i * i);
        }
        System.out.println("*Made by Silvio (I didn't copy).");
    }
}


