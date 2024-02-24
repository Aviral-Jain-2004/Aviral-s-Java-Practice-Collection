### Task:
Read  lines of input until you reach EOF(end of file, where no more data can be read from the source), then number and print all  lines of content.

***Hint***: Java's ```Scanner.hasNext()``` method is helpful for this problem.

### Input Format  
Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

### Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

### Sample Input
```
Hello world
I am a file
Read me until end-of-file.
```
### Sample Output
```
1 Hello world
2 I am a file
3 Read me until end-of-file.
```
### Code
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Initializing variable n to count number of lines
        int n = 0;

        // Reading input till end of file (EOF)
        while(sc.hasNext()){
            // Reading input line
            String line = sc.nextLine();
            // Incrementing n (n = n+1)
            n++;
            // Displaying output to console
            System.out.println(n + " " + line);
        }

        // Closing scanner object
        sc.close();
    }
}

```
