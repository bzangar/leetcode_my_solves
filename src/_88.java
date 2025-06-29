import java.util.Arrays;
//28.06.2025
public class _88 {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0}; int m = 3;
        int [] nums2 = {2,5,6}; int n = 3;

        merge(nums1, m, nums2, n);

        for(int a: nums1){
            System.out.print(a +" ");
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, j = 0; i < nums1.length; i ++, j++){
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}
