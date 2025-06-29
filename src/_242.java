import java.util.Arrays;

//28.06.2025
public class _242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));

//        Beats
//        77.72%

    }

    static public boolean isAnagram(String s, String t) {
        boolean result = true;
        char [] c1 = s.toCharArray();
        char [] c2 = t.toCharArray();

        if(c1.length != c2.length){
            return false;
        }

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i = 0; i < c1.length; i++){
            if(c1[i] != c2[i]){
                result = false;
            }
        }
        return result;
    }
}
