import java.util.HashMap;

public class _20 {
    //13.06.2025

    public static void main(String[] args) {
        String s = "{]";
        System.out.println(isValid(s));
    }

    static public boolean isValid(String s) {
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('{', '}');
        brackets.put('(', ')');
        brackets.put('[', ']');

        boolean result = true;

        for(int i = 0; i < s.length(); i+=2){
            char a = s.charAt(i);
            char b = brackets.get(a);


            if(s.charAt(i) != a && s.charAt(i+1) != b) {
                result = false;
            }
        }

        return result;
    }

}
