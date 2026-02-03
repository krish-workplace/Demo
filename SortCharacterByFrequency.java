import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Pair{
    int count;
    char ch;

    Pair(int count,char ch)
    {
        this.ch = ch;
        this.count = count;
    }
}

public class SortCharacterByFrequency {

    public String frequencySort(String s) {

        HashMap<Character,Integer> hMap = new HashMap<>();
        StringBuffer sBuffer = new StringBuffer();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            hMap.put(ch, hMap.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Pair> pQueue = new PriorityQueue<>((a,b)->{
            return b.count - a.count;
        });
        for(Map.Entry<Character,Integer> entry: hMap.entrySet())
        {
            pQueue.offer(new Pair(entry.getValue(), entry.getKey()));
        }

        while (!pQueue.isEmpty()) {
            
            Pair pair = pQueue.poll();
            for(int i=1;i<=pair.count;i++)
            {
                sBuffer.append(pair.ch);
            }
        }

        return sBuffer.toString();
    }

}
