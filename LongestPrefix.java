import java.util.Arrays;

public class LongestPrefix {

    public String longestCommonPrefix(String[] strs) {
     
        if(strs.length == 1)
            return strs[0];

        StringBuffer sBuffer = new StringBuffer();

        int n  = strs.length;
        
        Arrays.sort(strs);

        //then check between first and last one 
        for(int i=0;i<strs[0].length();i++)
        {
            if(strs[0].charAt(i) == strs[n-1].charAt(i))
                sBuffer.append(strs[0].charAt(i));
            else 
                break;
        }

        return sBuffer.toString();
    }
    
}