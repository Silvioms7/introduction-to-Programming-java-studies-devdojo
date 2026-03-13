// March 10, 2026
package academy.devdojo.arrays;

public class Arrays02 {
    static void main(String[] args) {
        String [] names = new String[5];
        names[0] = "Jesus";
        names[1] = "Silvio";
        names[2] = "Goku";
        names[3] = "Jorge";
        names[4] = "Saitama";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
