import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstUninqueCharacter {
    public int firstUniqChar(String s) {

        LinkedHashMap<Character,Integer> hMap = new LinkedHashMap<>();

        for(int i=0;i<s.length();i++)
        {
            if(hMap.containsKey(s.charAt(i)))
            {
                hMap.put(s.charAt(i), -1);
            }
            else
            {
                hMap.put(s.charAt(i), i);
            }
        }

        for(Map.Entry<Character,Integer> entry : hMap.entrySet())
        {
            if(entry.getValue() != -1)
                return entry.getValue();
        }

        return -1;
    }
}
