package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args){
        int[] nums={10,9,2,5,3,7,101,18};
        int[][] dp = new int[nums.length+1][nums.length];
        for(int [] arr:dp){
            Arrays.fill(arr,-1);
        }
        System.out.println(longestIncreasingSubsequence(nums,-1,0,dp));

    }
    public static int longestIncreasingSubsequence(int[] nums, int prev,int curr,int[][] dp){
        if(curr==nums.length){
            return 0;
        }
        if(dp[prev+1][curr]!=-1){
            return dp[prev+1][curr];
        }
        int notPick=longestIncreasingSubsequence(nums,prev,curr+1,dp);
        int pick=0;
        if(prev==-1 || nums[prev]<nums[curr]){
            pick=1+longestIncreasingSubsequence(nums,curr,curr+1,dp);
        }
        return dp[prev+1][curr]=Math.max(pick,notPick);
    }
}
