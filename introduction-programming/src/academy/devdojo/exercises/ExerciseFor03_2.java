// March 10, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseFor03_2 {
    static void main(String[] args) {
        // multiplication table - DevDojo
        for (int i = 1; i <= 12; i++) {
            System.out.println("------------------------------");
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + "x" + j + "= " + i*j);
            }
        }
    }
}
