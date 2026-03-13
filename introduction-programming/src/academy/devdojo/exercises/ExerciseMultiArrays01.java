// March 12, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseMultiArrays01 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[3][3];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("Type number [%d][%d]%n", i, j);
                array[i][j] = input.nextInt();
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.printf("The calculation of the square matrix trace is equal to = %d",sum);
    }
}
