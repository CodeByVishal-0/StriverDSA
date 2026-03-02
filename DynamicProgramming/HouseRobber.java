package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args){
        int[] nums={1,2,3,1};
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int ans= helper(nums,0,dp);
        System.out.println(ans);
    }
    public static int helper(int[] nums,int n,int[] dp){
        if(n>=nums.length){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        //pick
        int l = nums[n]+helper(nums,n+2,dp);
        //notpick
        int r= helper(nums,n+1,dp);
        return dp[n]=Math.max(l,r);
    }
    
}
