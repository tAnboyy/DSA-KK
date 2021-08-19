package data_structures;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrSwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

    }
    static void swapArInd(int[] arr, int ind1, int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
