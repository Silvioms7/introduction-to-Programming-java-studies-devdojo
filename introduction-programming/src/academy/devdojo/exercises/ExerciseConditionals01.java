package academy.devdojo.exercises;

public class ExerciseConditionals01 {
    static void main(String[] args) {
        float salary = 12000.0f;
        double result = 0;
        String porcentageValue = null;
        if (salary > 5000) {
            result = salary * 0.3;
            porcentageValue = "30%: " + result;
        } else {
            result = salary * 0.15;
            porcentageValue = "15%: " + result;
        }
        System.out.println(porcentageValue);
        System.out.println("*Made by Silvio (I didn't copy).");
    }
}
