package arrays;
import java.util.Scanner;
public class SecondLargestElement
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i = 0;i<size;i++){
            a[i] = sc.nextInt();
        }
        int max1 = 0,max2 = 0;
        if(a[0]>a[1]){
            max1 = a[0];
            max2 = a[1];
        }else{
            max1 = a[1];
            max2 = a[0];
        }
        for(int i =2;i<size;i++){
            if(a[i]>max1){
                max2 = max1;
                max1 = a[i];
            } else if (a[i]>max2) {
                max2 = a[i];
            }
        }
        System.out.println("The second largest element is "+max2);
    }
}
