// March 9, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseWhile03 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "Saitama";
        String password = "123456";
        String usernameLogin = "";
        String passwordLogin = "";
        while (!usernameLogin.equals(username) && !passwordLogin.equals(password)) {
            System.out.println("Username: ");
            usernameLogin = input.next();
            System.out.println("Password: ");
            passwordLogin = input.next();
            if (!usernameLogin.equals(username) && !passwordLogin.equals(password)) {
                System.out.println("ACCESS DENIED");
            }
        }
        System.out.println("ACCESS GRANTED");
        System.out.println("*Made by Silvio (I didn't copy).");
    }
}
