code:
```
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
```
