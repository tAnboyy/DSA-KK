package array;

import java.util.Scanner;

public class ArrayL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//
//        ArrayList<Integer> arrayList = new ArrayList<>(10);
//        arrayList.add(2);
//        arrayList.add(5);

//        for(int val : arrayList){
//            System.out.println(val);
//        }

        java.util.ArrayList<java.util.ArrayList<Integer>> arr2 = new java.util.ArrayList<>(2); //2D ArrayList
        for (int i = 0; i < 2; i++) {
            arr2.add(new java.util.ArrayList<>());
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr2.get(i).add(in.nextInt());
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(arr2.get(i));
        }

    }
}
