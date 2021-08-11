package com.dsa;

import java.util.ArrayList;
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

        ArrayList<ArrayList<Integer>> arr2 = new ArrayList<>(2); //2D ArrayList
        for (int i = 0; i < 2; i++) {
            arr2.add(new ArrayList<>());
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
