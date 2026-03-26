package labsheets;
public class zalgorithm {
    public static void main(String[] args){
        String str = "ABABABC";
        String pattern = "ABC";

        String combined = pattern + "$" + str;
        int combinedLength = combined.length();
        int patternLength = pattern.length();
        int[] z = new int[combinedLength];

        int left = 0;
        int right = 0;
        for (int i = 1; i < combinedLength; i++) {
            if (i <= right) {
                z[i] = Math.min(right - i + 1, z[i - left]);
            }

            while (i + z[i] < combinedLength && combined.charAt(z[i]) == combined.charAt(i + z[i])) {
                z[i]++;//z array matching string wirh pattern
            }

            if (i + z[i] - 1 > right) {
                left = i;
                right = i + z[i] - 1;
            }
        }

        boolean found = false;
        for (int i = patternLength + 1; i < combinedLength; i++) {
            if (z[i] == patternLength) {
                found = true;
                int matchIndex = i - patternLength - 1;
                System.out.println("Pattern found at index " + matchIndex);
            }
        }

        if (!found) {
            System.out.println("Pattern not found in the string");
        }
    }
    
}
