package LeetCode;

import java.util.HashMap;

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        // build hash map : character and how often it appears
        for (int i = 0; i < s.length(); i++) {
            int count = map.getOrDefault(s.charAt(i),0)+1;
            map.put(s.charAt(i),count);
        }

        // find the index
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i))==1) {
                return i;
            }
        }
        return -1;
    }
}
