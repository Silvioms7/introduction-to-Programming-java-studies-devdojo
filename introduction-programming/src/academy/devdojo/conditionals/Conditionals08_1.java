// March 9, 2026
package academy.devdojo.conditionals;

public class Conditionals08_1 {
    static void main(String[] args) {
        //test
        int day = 9;
        switch (day) {
            case 1:
                System.out.println("S");
                break; // or return;
            case 2:
                System.out.println("M");
                break; // or return;
            case 3:
                System.out.println("T");
                break; // or return;
            case 4:
                System.out.println("W");
                break; // or return;
            case 5:
                System.out.println("T");
                break; // or return;
            case 6:
                System.out.println("F");
                break; // or return;
            case 7:
                System.out.println("S");
                break; // or return;
            default:
                System.out.println("Invalid day number!");
        }
        System.out.println("end");
    }
}
