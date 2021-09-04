package array;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.max;

public class ArrMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }
        int ans = arr.get(0);
        for(int val : arr){
            if(val > ans) ans = val;
        }
        System.out.println(ans);
    }
}
