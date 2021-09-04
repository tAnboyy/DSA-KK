package binary_search;

public class OnesInSortedArr {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1 ,1 ,1 ,1, 1};
        int[] ind = firlas(arr, 1);
        int ans = ind[1] - ind[0] + 1;
        System.out.println(ans);
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
