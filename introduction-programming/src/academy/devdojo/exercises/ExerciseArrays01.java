// March 11, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseArrays01 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many grades would you like to input?");
        int inputGrades = input.nextInt();
        int sum = 0;
        double[] grades = new double[inputGrades];
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Input your " + "n." + (i + 1) + " grade!");
            grades[i] = input.nextDouble();
            sum += grades[i];
        }
        System.out.println("Your Average is:: " + (sum / grades.length));
        System.out.println("*Made by Silvio (I didn't copy).");
    }
}
