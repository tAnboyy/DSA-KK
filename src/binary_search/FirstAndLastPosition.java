package binary_search;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int num = 2;
        int[] ans = firlas(arr, num);
        System.out.println(ans[0] + " " + ans[1]);
    }

    private static int[] firlas(int[] arr, int target) {
        int[] ans = {-1, -1};
        ans[0] = Bsearch(arr, target, true);
        if(ans[0] != -1){
            ans[1] = Bsearch(arr, target, false);
        }
        return ans;
    }

    private static int Bsearch(int[] arr, int target, boolean firstPos) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) start = mid + 1;
            else if (target < arr[mid]) end = mid - 1;
            else {
                ans = mid;
                if (firstPos) end = mid - 1;
                else start = mid + 1;
            }
        }
        return ans;
    }
}
