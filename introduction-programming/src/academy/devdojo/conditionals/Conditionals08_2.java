// March 8, 2026
package academy.devdojo.conditionals;

public class Conditionals08_2 {
    static void main(String[] args) {
        //test
        int day = 9;
        switch (day) {
            case 1 -> System.out.println("S");
            case 2 -> System.out.println("M");
            case 3 -> System.out.println("T");
            case 4 -> System.out.println("W");
            case 5 -> System.out.println("T");
            case 6 -> System.out.println("F");
            case 7 -> System.out.println("S");
            default -> System.out.println("Invalid day number!");
        }
        System.out.println("end");
    }
}
