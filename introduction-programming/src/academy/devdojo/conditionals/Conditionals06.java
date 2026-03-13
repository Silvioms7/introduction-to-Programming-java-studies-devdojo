// March 7, 2026
package academy.devdojo.conditionals;

public class Conditionals06 {
    static void main(String[] args) {
        float ps5Price = 500;
        double creditCardAvailableCredit = 5000;
        double checkingAccountValue = 400;
        double savingsAccountValue = 200;
        if (creditCardAvailableCredit >= ps5Price || checkingAccountValue >= ps5Price || savingsAccountValue >= ps5Price)
            System.out.println("I can buy a PS5");
        else {
            System.out.println("I can not buy a PS5");
        }
    }
}
