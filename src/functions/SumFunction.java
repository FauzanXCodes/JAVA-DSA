package functions;
import java.util.Scanner;
public class SumFunction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The Sum of "+num1 +" and "+num2+" is "+sum(num1,num2));
    }
    static int sum(int n1,int n2){
        return n1+n2;
    }
}
