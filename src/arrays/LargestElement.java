package arrays;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class LargestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int temp = 0;
        int[] array = new int[size];
        for (int i = 0;i<size;i++){
            array[i] = sc.nextInt();
        }
        temp = array[0];
        for(int i = 1;i<size;i++){
            if(temp<array[i])
                temp = array[i];
            else{
                continue;
            }
        }
        System.out.println("The largest element is "+temp);
    }
}
