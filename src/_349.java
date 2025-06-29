
//28.06.2025

import java.util.*;

public class _349 {
    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        intersection(nums1, nums2);
    }

    static public int [] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int a: nums1){
            set1.add(a);
        }
        for(int a: nums2){
            set2.add(a);
        }

        set1.retainAll(set2);

        int[] result = set1.stream()
                .mapToInt(Integer:: intValue)
                .toArray();
        return result;
    }
}
