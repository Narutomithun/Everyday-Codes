package labsheets;
public class labsheet13b {
    public static void main(String[] args){
        int[] arr={4,2,6,3};
        int[] arr2={2,3,1,2};
        double quotient=0;
        double max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
                quotient=(double)arr[i]/arr2[j];
                if(quotient>max){
                    max=quotient;
                }

    }
    
}
System.out.println(max);
    }}