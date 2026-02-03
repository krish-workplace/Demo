import java.util.HashMap;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
     
        //*isomorphic means s to t mapping == t to s mapping 

        HashMap<Character,Character> sToTMap = new HashMap<>();
        HashMap<Character,Character> tToSMap = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);
                
            //^ step 1 s to t mapping 
            if(sToTMap.containsKey(sCh))
            {
                if(sToTMap.get(sCh) != tCh) // one to many mapping
                    return false;
            }
            else
            {
                //do mapping 
                sToTMap.put(sCh, tCh);
            }
            
            //^ step 2 t to s mapping
            if(tToSMap.containsKey(tCh))
            {
                if(tToSMap.get(tCh) != sCh) // one to many mapping 
                    return false;
            }
            else
            {
                tToSMap.put(tCh, sCh);
            }
        }
        return true;           
    }
}
