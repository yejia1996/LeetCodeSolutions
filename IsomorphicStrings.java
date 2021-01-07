package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        return isIsomorphicHelper(s,t) && isIsomorphicHelper(t,s);
    }

    public boolean isIsomorphicHelper(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if ( map.containsKey(s.charAt(i)) ) {
                if ( map.get(s.charAt(i)) != t.charAt(i) ) {
                    return false;
                }
            } else {
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
