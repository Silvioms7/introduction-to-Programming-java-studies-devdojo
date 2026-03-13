// March 9, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseConditionals07 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the number of the day of the week, consider 1 for Sunday and 7 for Saturday");
        int day = input.nextInt();
        switch (day) {
            case 1, 7 -> System.out.println("Weekend");
            case 2, 3, 4, 5, 6 -> System.out.println("Weeday");
            default -> System.out.println("Invalid input.");
        }
        System.out.println("*Made by Silvio (I didn't copy).");
    }
}
