
//1.07.2025

public class _704 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int target = 6;
        System.out.println(search(nums, target));
        System.out.println(5/2);

    }

    static public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int mid = (l + r)/2;
            int guess = nums[mid];
            if(guess == target){
                return mid;
            } else if (guess < target){
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return -1;
    }
}
