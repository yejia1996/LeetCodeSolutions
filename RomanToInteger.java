package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger rti = new RomanToInteger();
        String romanNumber = "IM";
        System.out.println(rti.toInteger(romanNumber));
    }

    public int toInteger(String romanNumber) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int result = 0;
        for (int i = 0; i < romanNumber.length()-1; i++) {
            String substrLeft = romanNumber.substring(i,i+1);
            String substrRight = romanNumber.substring(i+1,i+2);
            int valueLeft  = map.get(substrLeft);
            int valueRight  = map.get(substrRight);
            if (valueLeft < valueRight) {
                result = result - valueLeft;
            }
            else {
                result = result + valueLeft;
            }
        }
        String substrLast = romanNumber.substring(romanNumber.length()-1);
        result = result + map.get(substrLast);
        return result;
    }
}
