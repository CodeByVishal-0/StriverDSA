package DynamicProgramming.DPonStrings;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args){
        String text1="abdce";
        String text2="bdjdjjdc";
        int[][] dp = new int[text1.length()][text2.length()];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        System.out.println(helper(text1,0,text2,0,dp));
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int helper(String text1,int idx1,String text2, int idx2,int[][] dp){
        if(idx1==text1.length()||idx2==text2.length()){
            return 0;
        }
        if(dp[idx1][idx2]!=-1){
            return dp[idx1][idx2];
        }
        if(text1.charAt(idx1)==text2.charAt(idx2)){
            return dp[idx1][idx2]=1+helper(text1,idx1+1,text2,idx2+1,dp);
        }
        return dp[idx1][idx2]=Math.max(helper(text1,idx1+1,text2,idx2,dp),helper(text1,idx1,text2,idx2+1,dp));
    }
}
