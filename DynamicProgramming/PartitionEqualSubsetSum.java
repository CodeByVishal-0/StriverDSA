package DynamicProgramming;

import java.util.Arrays;

public class PartitionEqualSubsetSum {
    public static void main(String[] args){
        int[] nums={1,5,11,5};
        int target=0;
        for(int i=0;i<nums.length;i++){
            target=target+nums[i];
        }
        if(target%2!=0){
            System.out.println(false);
        }
        target=target/2;
        int[][] dp = new int[nums.length][target + 1];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        System.out.println(subsetsum(nums,0,target,dp));
    }
    public static boolean subsetsum(int[] nums,int idx,int target,int[][] dp){
        int n=nums.length;
        if(target==0){
            return true;
        }
        else if(idx==n-1){
            return nums[idx]==target;
        }
        if(dp[idx][target] != -1){
            return dp[idx][target] == 1;
        }
        boolean nottake=subsetsum(nums,idx+1,target,dp);
        boolean take=false;
        if(target>=nums[idx]){
            take=subsetsum(nums,idx+1,target-nums[idx],dp);
        }
        dp[idx][target] = (take || nottake) ? 1 : 0;
        return take||nottake;
    }
}
