package string;//Reversed Strings

import java.util.Arrays;
import java.util.Scanner;

public class StrRev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string to be reversed- ");
        String s = in.nextLine();
        char[] ch = s.toCharArray();
//        System.out.println(ch); //prints the string(ie the collective chars)stored in ch array
//        revStr(ch);
        revStr2(s);
//        System.out.println(s);
    }

    private static void revStr(char[] chx) { //for single word string
        int start = 0;
        int end = chx.length - 1;
        while (start < end) {
            char temp = chx[start];
            chx[start] = chx[end];
            chx[end] = temp;
            start++;
            end--;
        }
    }

    private static void revStr2(String s) { //for multiple worded string
        String[] words = s.split(" ");

        for (String word : words) {
            char[] ca = word.toCharArray();
            revStr(ca);
            System.out.print(new String(ca) + " ");
        }

    }
}
