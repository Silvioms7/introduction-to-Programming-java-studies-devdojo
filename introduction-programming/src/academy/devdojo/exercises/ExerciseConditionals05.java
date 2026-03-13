// March 8, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseConditionals05 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type your username: ");
        String username = input.next();
        if (username.equals(" ")
                || username.equalsIgnoreCase("administrator")
                ||  username.equalsIgnoreCase("admin")){
            System.out.println("Invalid username");
        } else {
            System.out.println(username + " was registered successfully");
        }
        System.out.println("*Made by Silvio (I didn't copy).");
    }
}