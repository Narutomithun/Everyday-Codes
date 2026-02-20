import java.util.Arrays;

class lab7{
    public static void main(String[] args) {
        int[] arr={10,70,50,35,60,90};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[2]);
    }
}