package string;

public class Palindrome {
    public static void main(String[] args) {
//        String str = "";
//        String str = null;
        String str = "XYBYBYX";

        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    private static boolean isPalindrome(String str) { //TODO: Do recursive solution later

        if (str == null) return false;

        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
