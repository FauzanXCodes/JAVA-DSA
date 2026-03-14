import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float init_amount = sc.nextFloat();
        float interest = sc.nextFloat();
        int time = sc.nextInt();
        System.out.println("The Simple Interest for "+init_amount+" is "+((init_amount*interest*time)/100));
    }
}
