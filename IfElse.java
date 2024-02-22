import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==1){
            System.out.println("Weird");
        }else{
            if(5>=n && n>=2){                     // using '&&' means both conditions must be true
                System.out.println("Not Weird");
            }else if(20>=n && n>=6){
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
            }
        }
    }
}
