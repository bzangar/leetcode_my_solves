
//28.06.2025

import java.util.Arrays;

public class _268 {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i <= n; i ++){
            if(i != nums[i]){
                return i;
            }
        }
        return -1;
    }

    public static int missingNumber2(int[] nums) {
        int n = nums.length;
        int sum1 = 0;
        int sum2 = n;
        for(int i = 0; i < n; i ++){
            sum1+=nums[i];
            sum2 += i;
        }

        return sum2 - sum1;
//        Beats
//        100.00%


    }
}
