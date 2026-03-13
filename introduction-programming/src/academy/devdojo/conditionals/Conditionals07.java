package academy.devdojo.conditionals;

public class Conditionals07 {
    static void main(String[] args) {
        float income = 4472f;
        if (income >= 0 && income <= 9950) {
            System.out.println(income * 0.1);
        } else if (income >= 9951 && income <= 40525) {
            System.out.println(income * 0.12);
        } else if (income >= 40526 && income <= 86375) {
            System.out.println(income * 0.22);
        } else if (income >= 86376 && income <= 164925) {
            System.out.println(income * 0.24);
        } else if (income >= 164926 && income <= 209425) {
            System.out.println(income * 0.32);
        } else if (income >= 209426 && income <= 523600) {
            System.out.println(income * 0.35);
        } else {
            System.out.println(income * 0.37);
        }
    }
}
