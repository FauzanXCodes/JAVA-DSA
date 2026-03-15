package loops;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev_num = 0;
        while(num > 0) {
            int last_digit = num % 10;
            rev_num = rev_num * 10 + last_digit;
            num = num / 10;
        }
        if(rev_num == temp){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}

