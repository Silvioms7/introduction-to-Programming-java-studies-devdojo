// March 6, 2026
package academy.devdojo.variables;

public class Variables01 {
    static void main(String[] args) {
        byte age = 18; // -128 to 127
        short houseNumber = 23333; // -32,768 to 32,767
        int counter = 1534543534; // -2,147,483,648 to 2,147,483,647
        long serialNumber = 9223372036854805l; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float regularNumber = 1324242.f; // 6 to 7 decimal digits
        double elonMuskFortune = 132434353.32131; // 5 to 16 decimal digits
        boolean condition = false;
        char gender = 'M';
        System.out.println("Age: " + age);
        System.out.println("House Number: " + houseNumber);
        System.out.println("Counter: " + counter);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Regular Number: " + regularNumber);
        System.out.println("Elon Musk Fortune: " + elonMuskFortune);
        System.out.println("Condition: " + condition);
        System.out.println("Gender: " + gender);
        System.out.println("*Made by me (I didn't copy). By: Silvio*");
    }
}
