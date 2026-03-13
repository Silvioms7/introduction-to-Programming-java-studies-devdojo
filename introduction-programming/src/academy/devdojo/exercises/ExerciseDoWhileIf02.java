// March 11, 2026
package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseDoWhileIf02 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Digite o primeiro numero que deseja realizar a media: ");
            int num1 = input.nextInt();
            System.out.println("Agora, digite o segundo numero: ");
            int num2 = input.nextInt();
            if (!(num1 == 0 && num2 == 0)) {
                System.out.println("A media dos valores é igual a: " + ((num1+num2)/2));
                break;
            }
            System.out.println("Ambos os valores sao '0', por favor digite outros! Abaixo");
            System.out.println("-------------------------------------------------------");
        } while (true);
        System.out.println("*Made by Silvio (I didn't copy).");
    }
}
