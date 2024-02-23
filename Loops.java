// Task
// Read an integer as input, print its first 10 multiples. Each multiple should be printed on a new line in the form: N x i = result.
// Sample Input:
// 2
//
// Sample Output:
// 2 x 1 = 2
// 2 x 2 = 4
// 2 x 3 = 6
// 2 x 4 = 8
// 2 x 5 = 10
// 2 x 6 = 12
// 2 x 7 = 14
// 2 x 8 = 16
// 2 x 9 = 18
// 2 x 10 = 20

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        // Scanner object
        Scanner sc = new Scanner(System.in);

        // Reading input
        int N = sc.nextInt();

        // Loop
        for(int i=1; i<=10; i++){
            // Printing output to console
            System.out.println(N + " x " + i + " = " + (N*i));
        }

        // Closing object
        sc.close();
    }
}
