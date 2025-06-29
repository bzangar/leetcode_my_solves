import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//28.06.2025
public class _217 {
    public static void main(String[] args) {

    }

    public static boolean containsDuplicate(int[] nums) {
        boolean result = false;
        Set<Integer> list = new HashSet<>();

        for(int a: nums){
            list.add(a);
            if(list.contains(a)){
                result = true;
            }
        }
        return result;
    }
}
