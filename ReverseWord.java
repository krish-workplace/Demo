public class ReverseWord {
    public String reverseWords(String s) {
     
        StringBuilder ans = new StringBuilder("");

        int i = s.length()-1;

        //traverse from right to left
        while (i>=0) {
            
            //skip the white space
            while (i>=0 && s.charAt(i) == ' ') {
                i--;
                continue;
            }

            if(i<0)
                break;

            //now character comes
            int end = i;
            
            //repeat till first white space come 
            while (i>=0 && !(s.charAt(i) == ' ')) {
                i--;
            }

            //add space between two words
            if(ans.length() > 0)
            {
                ans.append(" ");
            }

            ans.append(s.substring(i+1,end+1));

        }

        return ans.toString();
    }
}
