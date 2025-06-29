
//28.06.2025

import java.util.Arrays;

public class _389 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }

    static public char findTheDifference(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        int sum1 = 0;
        int sum2 = 0;

        for(char c: c1){
            sum1+=c;
        }
        for(char c: c2){
            sum2+=c;
        }

        return (char)Math.abs(sum1-sum2);
    }
}
