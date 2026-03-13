// March 12, 2026
package academy.devdojo.arrays;

public class MultiArrays02 {
    static void main(String[] args) {
        int[][] multiArrays = new int[2][3];
        multiArrays[0][0] = 1;
        multiArrays[0][1] = 2;
        multiArrays[0][2] = 3;
        multiArrays[1][0] = 4;
        multiArrays[1][1] = 5;
        multiArrays[1][2] = 6;
        for (int i = 0; i < multiArrays.length; i++) {
            for (int j = 0; j < multiArrays[i].length; j++) {
                System.out.println("["+i+"]["+j+"]=" + multiArrays[i][j]);
            }
        }
    }
}
