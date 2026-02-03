public class RemoveOtherMostParenthesis {

    public String removeOuterParentheses(String s) {
        
        //first find decomposition string 
        // then remove outer most and append to ans String

        StringBuilder ans = new StringBuilder("");

        int noOfOpenign = 0;

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(ch == '(')
            {
                noOfOpenign++;

                //check ( is already open or not 
                if(noOfOpenign > 1)
                {
                    ans.append(ch);
                }

            }
            else if(ch == ')')
            {
                noOfOpenign--;

                if(noOfOpenign >= 1)
                {
                    ans.append(ch);
                }
            }


        }
        
        return ans.toString();
    }

}