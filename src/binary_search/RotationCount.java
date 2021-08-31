package binary_search;

public class RotationCount {
    public static void main(String[] args) {
//        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int num = 0;
        int[] arr = {0, 1, 2, 3, 4};

        int ans = findPivot(arr);
        System.out.println(ans + 1);
    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 conditions
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] < arr[start]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

}
