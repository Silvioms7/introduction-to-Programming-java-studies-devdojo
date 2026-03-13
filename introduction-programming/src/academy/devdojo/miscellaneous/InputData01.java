// March 8, 2026
package academy.devdojo.miscellaneous;

import java.util.Scanner;
/*
* Coletar o nome completo
* Coletar o CPF
* Coletar o numero do cartao
* Coletar a validade do cartao
* Coletar o CVC
* Pedir para comfirmar os dados!
*
* programa de treino!
*/
public class InputData01 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o seu nome completo abaixo.");
        String name = input.next();
        System.out.println("Infrome o seu CPF abaixo.");
        String cpf = input.next();
        System.out.println("Informe o numero do cartao.");
        String numeroDoCartao = input.next();
        System.out.println("Informe a validade do cartao.");
        String validadeDoCartao = input.next();
        System.out.println("Informe o CVC.");
        String cvc = input.next();
        System.out.println("Por gentileza, comfirme os dado e em seguida comfirme a compra!");
        System.out.println("Nome completo: " + name);
        System.out.println("CPF: " + cpf);
        System.out.println("Numero do cartao: " + numeroDoCartao);
        System.out.println("Validade do cartao: " + validadeDoCartao);
        System.out.println("CVC: " + cvc);
        System.out.println("Para confirmar digite 'Confirmar'. ");
        String comfirmacao = input.next();
        if (comfirmacao.equals("Confirmar")) {
            System.out.println("COMPRA COMFIRMADA!");
        } else {
            System.out.println("COMPRA NEGADA!");
        }
        System.out.println("*Made by me (I didn't copy). By: Silvio*");
    }
}
