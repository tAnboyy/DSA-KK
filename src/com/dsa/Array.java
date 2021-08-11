package com.dsa;


import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for(int[] row: arr){
            for(int val: row){
                System.out.print(val + " ");
            }
            System.out.println();
        }

        for(int[] row: arr){
            System.out.println(Arrays.toString(row));
        }
    }
}
