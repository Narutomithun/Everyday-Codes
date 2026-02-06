class leet {
    public static void main(String[] args) {
        int[] arr = {1, 9, 9};
        int[] res = plusOne(arr);
        
        for(int j : res) {
            System.out.println(j);
        }
    }
    
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        
        
        for(int i = n - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}