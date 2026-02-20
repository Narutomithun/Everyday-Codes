import java.util.*;
public class hashmap {
        static int Twosum(int[] arr, int target){
            HashMap<Integer,Integer> Twosum=new HashMap<>();
            int count=0;
            for(int i=0;i<arr.length;i++){
                    if(Twosum.containsKey(arr[i]-target)){
                        count+=Twosum.get(arr[i]-target);
                    }
                    Twosum.put(arr[i],Twosum.getOrDefault(arr[i],0)+1);

            }
            return count;

        }
        public static void main(String[] args) {
            int[] arr = {1, 5, 7, -1, 5}; 
            int target = 6;
            System.out.println(Twosum(arr,target)); 
        }
}
