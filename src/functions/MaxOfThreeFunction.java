package functions;
import java.util.Scanner;
public class MaxOfThreeFunction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The Max Number out of your numbers us :"+maxNumber(a,b,c));
    }
    static int maxNumber(int a,int b,int c){
        if(a>=b && a >=c){
            return a;
        }else if(b>=a && b>=c){
            return b;
        }else{
            return c;
        }
    }
}

