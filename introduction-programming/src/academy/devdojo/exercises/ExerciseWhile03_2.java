// March 9, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseWhile03_2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usernameSaved = "Saitama";
        String passwordSaved = "123456";
        while (true) {
            System.out.println("Username: ");
            String username = input.next();
            System.out.println("Password: ");
            String password = input.next();
            if (username.equals(usernameSaved) && password.equals(passwordSaved)) {
                System.out.println("ACCESS GRANTED");
                break;
            }
                System.out.println("ACCESS DENIED");
        }
    }
}
