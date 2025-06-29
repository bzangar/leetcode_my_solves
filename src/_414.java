//28.06.2025

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _414 {
    public static void main(String[] args) {
        int [] nums = {1,2,-2147483648};
        System.out.println(thirdMax(nums));
    }

    static public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        for(int i = 0; i < nums.length; i++){

            list2.add(nums[i]);
        }

        for(int i = nums[0]; i <= nums[nums.length-1]; i++){
            list1.add(i);

        }

        list1.retainAll(list2);

        for(int a: list1){
            System.out.print(a + " ");
        }
        if(list1.size() < 3){
            return list1.get(list1.size()-1);
        } else {
            return list1.get(list1.size() - 3);
        }


    }
}
