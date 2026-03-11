package DynamicProgramming;

import java.util.Arrays;

public class CountSubsetsSumK {
    public static void main(String[] args){
        int[] nums={1,2,2,3};
        int k=3;
        int[][] dp =new int[nums.length][k+1];
        for(int[] arr:dp){
            Arrays.fill(arr, -1);
        }
        System.out.println(countSubsets(nums,k,0,dp));
    }
    public static int countSubsets(int [] nums,int k,int i,int[][] dp){
       if(i == nums.length){
            return k == 0 ? 1 : 0;
        }
        if(dp[i][k]!=-1){
            return dp[i][k];
        }
        int notpick =countSubsets(nums,k,i+1,dp);
        int pick=0;
        if(nums[i]<=k){
            pick=countSubsets(nums,k-nums[i],i+1,dp);
        }
        return dp[i][k]=pick+notpick;
    }
}
