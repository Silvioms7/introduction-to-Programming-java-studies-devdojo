// March 8, 2026
package academy.devdojo.exercises;

public class ExerciseConditionals03 {
    static void main(String[] args) {
        int age = 13;
        String category = null;
        if (age < 13) {
            category = "Kids";
        } else if (age >= 13 && age < 16) {
            category = "Juvenile";
        } else {
            category = "Adult";
        }
        System.out.println(category);
        System.out.println("*Made by Silvio (I didn't copy).");
    }
}
