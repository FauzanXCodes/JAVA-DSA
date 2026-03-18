package arrays;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt() ;
        int[] input_array = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i = 0;i<size;i++){
            input_array[i] = sc.nextInt();
        }
        System.out.println("You array is :");
        for(int i = 0;i<size;i++){
            System.out.print(input_array[i]);
        }
        System.out.println();
        int sum = 0;
        System.out.println("The sum of the elements in array is:");
        for (int i = 0;i<size;i++){
            sum = sum + input_array[i];

        }
        System.out.println(sum);
    }
}
