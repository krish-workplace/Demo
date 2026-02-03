import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    
    public static String MinWindowSubstring(String[] strArr) {
        String s = strArr[0], t = strArr[1];

        int minLen = Integer.MAX_VALUE, startIndex = -1;

        // Iterate over every possible starting position
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            Map<Character, Integer> map = new HashMap<>();
            
            // Build frequency map for `t`
            for (int k = 0; k < t.length(); k++) { // FIXED LOOP
                map.put(t.charAt(k), map.getOrDefault(t.charAt(k), 0) + 1);
            }

            // Try finding the window from i to j
            for (int j = i; j < s.length(); j++) {
                if (map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) > 0) {
                    map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                    count++;
                }

                if (count == t.length()) { // Found a valid substring
                    if ((j - i + 1) < minLen) {
                        startIndex = i;
                        minLen = (j - i + 1);
                    }
                    break;
                }
            }
        }

        // Return result
        return (startIndex == -1) ? "" : s.substring(startIndex, startIndex + minLen);
    }


    public static void main(String[] args) {
        
    }
}