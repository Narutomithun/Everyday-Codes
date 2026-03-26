package labsheets;
import java.util.*;
public class labsheet8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target number");
        int target=sc.nextInt();
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.print("The target element is in index : ");
                System.out.println(i);
            }
        }
    }
}
