import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

    HashMap<Character, Integer> map = new HashMap<>();
    
    for (char c : s.toCharArray()) {
        map.put (c, map.getOrDefault(c, 0) + 1);
    }
    
    for (char h : t.toCharArray()) {
        if (map.containsKey(h) && map.get(h) > 0) {
           map.put(h, (map.get(h) - 1));
        } else {
            return false;
        }
    }    
    
    return true;
}    
}
    //     Set<Character> set = new HashSet();
    //     if (s.length() != t.length()) {
    //         return false;
    //     }
    //     for (int i = 0; i < s.length(); i++) {
    //         set.add(s.charAt(i));
    //     }
    //     for ( int j = 0; j < t.length(); j++) {
    //         if (set.contains(t.charAt(j))) {
    //             return true;
    //         } else {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
