package binary_search;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 9};
        int num = 15;
        int ans = ceiling(arr, num);
        System.out.println(ans);
    }

    private static int ceiling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }

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
        return start;
    }
}
