// March 10, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

    public class ExerciseFor02 {
        static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Type a number!");
            int number = input.nextInt();
            for (int i = 0; i <= number; i++) {
                System.out.println(i + " x 5 = " + i * 5);
            }
            System.out.println("*Made by Silvio (I didn't copy).");
        }
    }



