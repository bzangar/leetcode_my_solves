
//01.07.2025

public class _852 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int mid = (l + r) / 2;
            int right = mid + 1;
            if (arr[right] > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}

//Runtime
//0
//ms
//        Beats
//100.00%

//Memory
//56.61
//MB
//        Beats
//14.50%
