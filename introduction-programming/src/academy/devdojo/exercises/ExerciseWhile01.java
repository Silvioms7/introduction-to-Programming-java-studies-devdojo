// March 9, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseWhile01 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = input.nextInt();
        int n = 0;
        while (n <= number) {
            if ((n % 2) != 0) {
                System.out.println(n);
            }
            n++;
        }
        System.out.println("*Made by me (I didn't copy).");
    }
}
