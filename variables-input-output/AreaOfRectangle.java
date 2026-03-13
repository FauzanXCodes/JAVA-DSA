import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float breath = sc.nextFloat();
        System.out.println("The Area of rectangle is "+ (length*breath));
    }
}
