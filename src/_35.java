import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _35 {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target = 7;

        System.out.println(searchInsert(nums, target));


    }

    static int searchInsert(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while (low <= high){
            int mid = (low + high)/2;
            int guess = nums[mid];

            if(guess == target){
                return mid;
            } else if(guess > target){
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
