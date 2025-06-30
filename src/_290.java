import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//30.06.2025

public class _290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "cat dog dog cat";
        System.out.println(wordPattern(pattern, s));

    }
    static public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] words = s.split(" ");

        if(words.length != pattern.length()){
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){
            String word = words[i];
            char c = pattern.charAt(i);



            if(map.containsKey(c)){
                if(!map.get(c).equals(word)){
                    return false;
                }
            } else {
                if(set.contains(word)){
                    return false;
                }
                map.put(c, words[i]);
                set.add(word);
            }
        }
        return true;
    }
}


//Runtime
//1
//ms
//        Beats
//79.55%
//Analyze Complexity
//Memory
//41.90
//MB
//        Beats
//5.81%

