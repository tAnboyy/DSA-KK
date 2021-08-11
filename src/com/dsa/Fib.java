package com.dsa;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = a;
            a = b;
            b = temp + b;
            count++;
        }

        System.out.println(b);

    }
}
