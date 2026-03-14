import java.util.Scanner;
public class SwapWithoutThirdVariable {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Before swap: a = " + a + ", b = " + b);

            // Step 1: a becomes the sum of both numbers (30)
            a = a + b;

            // Step 2: b becomes the original value of a (30 - 20 = 10)
            b = a - b;

            // Step 3: a becomes the original value of b (30 - 10 = 20)
            a = a - b;

            System.out.println("After swap: a = " + a + ", b = " + b);
        }
}
