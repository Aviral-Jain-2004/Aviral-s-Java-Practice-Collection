### Strings  
The elements of a String are called characters.  
The number of characters in a String is called the length.  
Length can be retrieved with the String.length() method.  
***Declaration*** : ```String myString = "Hello World!"```
### Task
Given two strings of lowercase English letters, A and B, perform the following operations:
Sum the lengths of A and B.
Determine if A is lexicographically larger than B (i.e.: does A come before B in the dictionary?).
Capitalize the first letter in A and B, and print them on a single line, separated by a space.
### Input Format  
The first line contains a string A.   
The second line contains another string B.   
The strings are comprised of only lowercase English letters.

### Output Format  
There are three lines of output:  
For the first line, sum the lengths of A and B.  
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.  
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

### Sample Input  
```
hello
java
```
### Sample Output  
```
9
No
Hello Java
```
### Code  
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // Creating Scanner Instance
        Scanner sc = new Scanner(System.in);

        // Reading input strings A and B
        String A = sc.nextLine();
        String B = sc.nextLine ();

        // Sum of lengths
        int sum = A.length() + B.length();

        // Comparing lexicographically
        String lex = A.compareTo(B) > 0? "Yes" : "No";

        // Capitalizing first character of strings A and B
        String Acap = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        String Bcap = Character.toUpperCase(B.charAt(0)) + B.substring(1);

        // Printing output to console
        System.out.println(sum);
        System.out.println(lex);
        System.out.println(Acap + " " + Bcap);
        
    }
}

```
