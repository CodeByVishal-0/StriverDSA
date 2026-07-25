package DynamicProgramming.DPonStrings;

import java.util.Arrays;

public class EditDistance {
    public static void main(String[] args) {
        String word1="horse";
        String word2="ros";
        System.out.println(editDistance(word1,word2));
    }
    public static int editDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int[][] dp = new int[m][n];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return f(word1, word2, 0, 0,dp);
    }

    public static int f(String word1, String word2, int i, int j,int[][] dp) {
        if (i == word1.length()) {
            return word2.length() - j;
        }
        if (j == word2.length()) {
            return word1.length() - i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int insert = Integer.MAX_VALUE;
        int remove = Integer.MAX_VALUE;
        int replace = Integer.MAX_VALUE;
        if (word1.charAt(i) == word2.charAt(j)) {
            return f(word1, word2, i + 1, j + 1,dp);
        } else {
            insert = 1 + f(word1, word2, i, j + 1,dp);
            replace = 1 + f(word1, word2, i + 1, j + 1,dp);
            remove = 1 + f(word1, word2, i + 1, j,dp);
        }
        return dp[i][j]=Math.min(insert, Math.min(remove, replace));

    }
}
