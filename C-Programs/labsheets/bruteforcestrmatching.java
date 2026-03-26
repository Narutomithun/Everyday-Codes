package labsheets;
public class bruteforcestrmatching {
    public static void main(String[] args){
        String str="ABABABC";
        String pattern="ABC";
        int strlength=str.length();
        int patternlength=pattern.length();
        boolean found=false;
        for(int i=0;i<strlength-patternlength+1;i++)//7-3+1=5
        {
            
            for(int j=0;j<patternlength;j++)//0<3
            {
                if(str.charAt(i+j)!=pattern.charAt(j))  
                {
                    break;
                }
            }
            if(j==patternlength)
            {
                found=true;
                System.out.println("Pattern found at index "+i);
            }
        }
        if(!found)
        {
            System.out.println("Pattern not found in the string");
        }
    }
}
