// March 9, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseWhile02_2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte result = 0;
        while (result != 3) {
            System.out.println("1. Calculate taxes");
            System.out.println("2. Deposit money");
            System.out.println("3. Exit");
            result = input.nextByte();
        }
        System.out.println("Program finished");
    }
}
