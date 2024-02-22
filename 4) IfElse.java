// Task
// Given an integer, n, perform the following conditional actions:
// If n is odd, print Weird
// If n is even and in the inclusive range of 2 to 5, print "Not Weird"
// If n is even and in the inclusive range of 6 to 20, print "Weird"
// If n is even and greater than 20, print "Not Weird"

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        // Creating Scanner instance to read input
        Scanner sc = new Scanner(System.in);

        // Reading the input number
        int n = sc.nextInt();

        // Checking if n is Weird or Not Weird via if-else statements
        // using '&&'(and) means all conditions must be true
        // using '||'(or) means any one conditions must be true
        if (n % 2 == 1 || (n >= 6 && n <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        // Closing sc to prevent resource leaks
        sc.close()
    }
}
