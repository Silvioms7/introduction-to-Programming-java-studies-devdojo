// March 9, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseWhile02 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        while (result != 3) {
            System.out.println("Welcome menu console!\n" + "What would you like to access?");
            System.out.println("1. Caculater taxes\n" + "2. Deposit money\n" + "3. Exit");
            result = input.nextInt();
            if (result == 1) {
                System.out.println("*Caculater taxes*\n" + "Type the amount you want to calculate.");
                float amount = input.nextFloat();
                float taxPercentage = 0.30f;
                System.out.println("Tax amount: " + (amount * taxPercentage) + ".\n1. Back menu.");
                input.nextInt();
            } else if (result == 2) {
                System.out.println("*Deposit money*\n" + "Type the amount you want to deposit.");
                float depositMoney = input.nextFloat();
                System.out.println("Okay, " + depositMoney + " has been deposited into your checking account! \n" +
                        "1. Back menu.");
                input.nextInt();
            }
        }
        System.out.println("Okay, successfully exiting!");
        System.out.println("*Made by Silvio (I didn't copy).");
    }
}
