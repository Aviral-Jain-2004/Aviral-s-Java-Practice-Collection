### In this challenge, we will read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below.

### INPUT FORMAT
There are three lines of input:
The first line contains an integer.
The second line contains a double.
The third line contains a String.

### OUTPUT FORMAT
There are three lines of output:
On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.
To make the problem easier, a portion of the code is already provided in the editor.

***Note***: The use of nextLine() method immediately following the nextInt() method, since the nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).

### Sample INPUT:
```
42
3.1415
Welcome to HackerRank's Java tutorials!
```

### Sample OUTPUT:
```
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
```

### CODE:
```
import java.util.Scanner;

public class InputOutput2{

    public static void main(String[] args) {

        //Creating scanner object
        Scanner sc = new Scanner(System.in);

        //Reading inputs
        int integerInput = sc.nextInt();
        double doubleInput = sc.nextDouble();
        sc.nextLine();                      // Reading remainder of previous input(which takes tokens)
        String stringInput = sc.nextLine();

        // displaying output to console
        System.out.println("String: " + stringInput);
        System.out.println("Double: " + doubleInput);
        System.out.println("Int: " + integerInput);

        sc.close();
    }
}

```
