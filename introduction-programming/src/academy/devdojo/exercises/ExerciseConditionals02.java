// March 7, 2026
package academy.devdojo.exercises;

public class ExerciseConditionals02 {
    static void main(String[] args) {
        long number = 10;
        String result = null;
        if ((number % 2) == 0) {
            result = "The number: " + number + " is even.";
        } else {
            result = "The number: " + number + " is odd.";
        }
        System.out.println(result);
        System.out.println("*Made by Silvio (I didn't copy).");
    }
}
