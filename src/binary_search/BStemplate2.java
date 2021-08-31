package binary_search;

public class BStemplate2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int num = 2;
        int ans = binarySearch(arr, num);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length; //not arr.length - 1
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == num) return mid;
            else if (arr[mid] < num) left = mid + 1;
            else if (arr[mid] > num) right = mid; //not mid - 1
        }
        if (left != arr.length && arr[left] == num) return left;
        return -1;
    }
}
