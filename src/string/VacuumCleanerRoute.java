package string;

public class VacuumCleanerRoute {
    public static void main(String[] args) {
        String s = "RUULLDRD";
        solve(s);
    }

    private static void solve(String s) {
        int sum = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'L') sum += 1;
            if (ch == 'R') sum += -1;
            if (ch == 'U') sum += 1;
            if (ch == 'D') sum += -1;
        }
        System.out.println(sum == 0);
    }
}
