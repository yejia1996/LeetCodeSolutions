package LeetCode;

import java.util.HashMap;

public class WordPattern {
    public String wordPatternHelper(String[] array){
        HashMap<String, Integer> map = new HashMap<>();
        StringBuffer strbuff = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                strbuff.append(map.get(array[i]));
            } else {
                strbuff.append(i);
                map.put(array[i],i);
            }
        }
        return strbuff.toString();
    }

    public boolean wordPattern(String pattern, String str) {
        String[] array = str.split(" ");
        if ( pattern.length() != array.length) { return false; }
        return wordPatternHelper(pattern.split("")).equals(wordPatternHelper(array));
    }
}
