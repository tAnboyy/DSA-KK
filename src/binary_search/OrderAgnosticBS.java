package binary_search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 6, 7, 9};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int num = 75;
        int ans = OA_binarySearch(arr, num);
        System.out.println(ans);
    }

    private static int OA_binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) return mid;

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
