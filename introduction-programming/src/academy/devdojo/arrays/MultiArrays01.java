// March 12, 2026
package academy.devdojo.arrays;

import java.util.Scanner;

public class MultiArrays01 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array1 = new int[3][3];
        for (int i = 0; i <= array1.length; i++){
            System.out.println("Type a number");
            array1[0][i] = input.nextInt();
            array1[1][i] = input.nextInt();
        }
        System.out.println(array1[0][0]);
        System.out.println(array1[0][1]);
        System.out.println(array1[0][2]);
        System.out.println(array1[1][0]);
        System.out.println(array1[1][1]);
        System.out.println(array1[1][2]);
    }
}
