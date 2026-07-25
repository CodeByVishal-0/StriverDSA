package DynamicProgramming.DPonStrings;

public class Wildcard_Matching {
    public static void main(String[] args) {
        String s = "abdefcd";
        String p = "ab*cd";
        System.out.println(isMatch(s, p));
    }

    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        Boolean[][] dp = new Boolean[m + 1][n + 1];
        return f(s, p, 0, 0, dp);
    }

    public static boolean f(String s, String p, int i, int j, Boolean[][] dp) {
        int m = s.length();
        int n = p.length();
        if (i == m && j == n) {
            return true;
        }
        if (j == n) {
            return false;
        }
        if (i == m) {
            while (j < n && p.charAt(j) == '*') {
                j++;
            }
            return j == n;
        }
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
            return dp[i][j] = f(s, p, i + 1, j + 1, dp);
        } else if (p.charAt(j) == '*') {
            return dp[i][j] = f(s, p, i, j + 1, dp) || f(s, p, i + 1, j, dp);
        } else {
            return dp[i][j] = false;
        }
    }
}
