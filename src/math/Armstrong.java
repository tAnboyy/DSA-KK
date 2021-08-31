package math;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number- ");
        int input = in.nextInt();
        if (isArmstrong(input)) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }
    }

    private static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }
        return sum == original;
    }
}
