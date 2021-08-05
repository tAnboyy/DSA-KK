package com.dsa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//
//        int sum = a + b;
//        System.out.println(sum);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans=1;
        while(n!=1){
            ans*=n;
            n--;
        }
        System.out.print(ans);
    }
}
