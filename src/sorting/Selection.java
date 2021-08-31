package sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int maxInd = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxInd]) maxInd = i;
        }
        return maxInd;
    }
}
