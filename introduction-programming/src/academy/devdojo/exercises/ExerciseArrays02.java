// March 12, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseArrays02 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array1 = new double[3];
        double[] array2 = new double[3];
        double[] array3 = new double[3];
        System.out.println("Type six numbers that will be divided into two arrays (three in each)., one at a time.");
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------------First Array!-------------------------------");
            System.out.println("Input your " + "n." + (i + 1) + " number from the first array!");
            array1[i] = input.nextDouble();
            System.out.println("-------------------Second Array!-------------------------------");
            System.out.println("Input your " + "n." + (i + 1) + " number from the second array!");
            array2[i] = input.nextDouble();
            array3[i] = array1[i] * array2[i];
            System.out.println("---------------Result First Array * Second Array---------------");
            System.out.println("Your " + "n." + (i + 1) + " multiplication = " + array3[i]);
        }
    }
}
