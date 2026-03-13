// March 7, 2026
package academy.devdojo.conditionals;

public class Conditionals05 {
    static void main(String[] args) {
        String savedName = "Saitama";
        String savedDreditCardNumber = "123";
        String savedSecuityCode = "300";

        String inputName = "Saitama";
        String inputDreditCardNumber = "123";
        String inputSecuityCode = "30";

        if ((savedName.equals(inputName)) && (savedDreditCardNumber.equals(inputDreditCardNumber)) && (savedSecuityCode.equals(inputSecuityCode))) {
            System.out.println("can buy");
        } else {
            System.out.println("cannot buy");
        }
    }
}
