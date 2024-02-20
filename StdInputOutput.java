// Importing 'Scanner' class from 'java.util' package for reading input.
import java.util.Scanner;

public class StdInputOutput {

    public static void main(String[] args) {
        // Creating a Scanner object.
        Scanner sc = new Scanner(System.in);

        // Reading inputs.
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        // Displaying output on separate lines using println.
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);

        // Closeing Scanner object (prevents resource leaks)
        sc.close();
    }
}
