package binary_search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int num = 2;
        int ans = binarySearch(arr, num);
        int ans1 = BSmethod(arr, num);
        System.out.println(ans);
        System.out.println(ans1);

    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //BS method from Java collections
    private static int BSmethod(int[] arr, int target) {
         return Arrays.binarySearch(arr, target);
    }
}

