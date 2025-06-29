import java.util.*;

public class _169 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums));
    }

    static public  int majorityElement(int[] nums) {
        List<Integer> n = new ArrayList<>();
        Set<Integer> un = new HashSet<>();
        for(int a: nums){
            n.add(a);
            un.add(a);
        }

        int maxFrequency = 0;
        int majorityElement = nums[0];

        for(int a: un){
            int frequency = Collections.frequency(n, a);
            if(frequency > maxFrequency){
                maxFrequency = frequency;
                majorityElement = a;
            }
        }
        return majorityElement;
    }
}
