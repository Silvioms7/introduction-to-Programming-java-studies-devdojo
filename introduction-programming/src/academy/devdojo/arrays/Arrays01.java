// March 10, 2026
package academy.devdojo.arrays;

public class Arrays01 {
    static void main(String[] args) {
        double[] grades = new double[3];
        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);

        grades[0] = 6;
        grades[1] = 8;
        grades[2] = 5;

        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);

        System.out.println("the length of the array is " + grades.length);
        System.out.println("Average: " + (grades[0] + grades[1] + grades[2]) / grades.length);
    }
}
