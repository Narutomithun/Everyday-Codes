import java.util.Scanner;
public class LABSHEET3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();
        int k = sc.nextInt();
        long result = (a * b) % p;
        if(result%k==0){
            System.out.println("Divisible");
        }
        else{
            System.out.println("Not Divisible");
        }
        System.out.println("20231CSE0128 MITHUN M NAIR");
     sc.close();
    }   
}
