public class QuestionMark {

  public static String QuestionsMarks(String str) {

    int i=0,count = 0,j=i+1;

    while(j < str.length())
    {

        while(i<str.length()-1 && !(Character.isDigit(str.charAt(i))))
        {
            i = j;
            j++;
        }

        if(j == str.length())
          return "false";

        while(j < str.length() && !(Character.isDigit(str.charAt(j))))
        {
            // i = j;
            if(str.charAt(j) == '?')
              count++;
            j++;
        }

        if(j == str.length())
          return "false";

        if(count == 3 && (Character.getNumericValue(str.charAt(i)) + Character.getNumericValue(str.charAt(j)) == 10))
        {
            return "true";
        }  
        else
        {
            count = 0;
            i = j;
            j++;
        }
    }

  
    // while(j < str.length())
    // {
    //     if(count == 3)
    //     {
    //         //  i+  j = 10 then return true
    //         if(Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(j)) && (Character.getNumericValue(str.charAt(i)) + Character.getNumericValue(str.charAt(j)) == 10))
    //         {
    //             return "true";
    //         }
    //         else{
    //           i = j;
    //           j++;
    //         }

    //         count = 0;
    //     }

    //     if(str.charAt(j)=='?')
    //     {
    //       count++;
    //       j++;
    //     }
    //     else
    //     {
    //       count = 0;
    //       i=j;
    //       j++;
    //     }
        
    // }
    // code goes here  
    return "false";
  }


    public static void main(String[] args) {
        
    }
}