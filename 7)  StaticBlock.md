### Introduction to Static Initialization Blocks  
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
### Task
To output the area of a parallelogram with breadth B and height H. Reading the variables from the standard input.
If B<=0 or H<=0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
### Input Format  
There are two lines of input. The first line contains B, the breadth of the parallelogram. The next line contains H, the height of the parallelogram.
### Output Format  
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
### Sample input 1
```
1
3
```
### Sample output 1
```
3
```
### Sample input 2
```
-1
2
```
### Sample output 2
```
java.lang.Exception: Breadth and height must be positive
```
### Code
```java
import java.util.Scanner;

public class Solution {
    // Creating Scanner instance
    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag = true;

    // Static block for input validation
    static {

        // Error handling
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Main class (entry point of the code)
    public static void main(String[] args){
        if (flag) {
            System.out.println(B*H);
        }
    }
}

```
