// March 12, 2026
package academy.devdojo.arrays;

import java.util.Scanner;

public class MultiArrays03 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] multiArrays = new int[2][3];
        for (int i = 0; i < multiArrays.length; i++) {
            for (int j = 0; j < multiArrays[i].length; j++) {
                System.out.printf("[%d][%d]%n", i, j);
                multiArrays[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < multiArrays.length; i++) {
            for (int j = 0; j < multiArrays[i].length; j++) {
                System.out.printf("[%d][%d] = %d%n", i, j, multiArrays[i][j]);
            }
        }
    }
}
