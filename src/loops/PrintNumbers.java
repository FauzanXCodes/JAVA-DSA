package loops;
import java.util.Scanner;
public class PrintNumbers {
    public static void main(String[] args){
        // Take a number N as input and print numbers from 1 to N.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =1;
        while(a<=n){
            System.out.print(a);
            a++;
        }
    }
}
