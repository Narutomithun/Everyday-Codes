public class NCR {
    public static int fact(int n,int r){
        if (n==1 || n==r){
            return 1;
        }
        else{
            return n*fact(n-1,r);
        }
    }
    public static void main(String[] args) {
        int n =6;
        int r=3;
        int k = n-r;
        if(r<n/2){
            System.out.println(fact(n,r));

        }
        else{
            System.out.println(fact(n, k));
        }
    }
    
}
