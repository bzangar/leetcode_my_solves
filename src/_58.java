//30.06.2025

public class _58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    static public int lengthOfLastWord(String s) {
        String [] str = s.split(" ");
        return str[str.length-1].length();
    }
}

//Runtime
//0
//ms
//        Beats
//100.00%
//
// Memory
//42.26
//MB
//        Beats
//5.47%