//30.06.2025

public class _28 {
    public static void main(String[] args) {
        String haystack = "sabutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    static public int strStr(String haystack, String needle) {

        for(int i = 0; i <= haystack.length()-needle.length(); i ++){
            String check = haystack.substring(i, i + needle.length());
            if(check.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}

//Runtime
//0
//ms
//        Beats
//100.00%
//
//Memory
//41.78
//MB
//        Beats
//34.50%