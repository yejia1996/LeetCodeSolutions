package LeetCode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        if (s.length()==0) {
            return 0;
        }
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i)==' ') {
                if(count == 0) {
                    continue;
                } else {
                    break;
                }
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        LengthOfLastWord llw = new LengthOfLastWord();
        System.out.println(llw.lengthOfLastWord("a "));
        System.out.println("watershed Area Flow Level Runoff ");
        System.out.println("water Coefficient and Efficiency ");
        System.out.println("precipitation");
        System.out.println("rainfall");
        System.out.println("wind speed");
        System.out.println("relative humidity");
        System.out.println("specific humidity");
        System.out.println("evaporation");
        System.out.println("transpiration");
        System.out.println("evapotranspiration");
        System.out.println("shortwave solar radiation");
    }
}
