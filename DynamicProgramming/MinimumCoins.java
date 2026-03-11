package DynamicProgramming;

import java.util.Arrays;

class MinimumCoins{
    public static void main(String[] args){
        int[] coins={9,6,5,1};
        int target=11;
        int[][] dp=new int[coins.length][target+1];
        for(int[] arr:dp){
            Arrays.fill(arr, -1);
        }
        System.out.println(change(coins,target,0,dp));
    }
    public static int change(int[] coins,int target,int i,int[][] dp){
        if(i==coins.length){
            if(target==0){
                return 0;
            }else{
                return 93485793; 
            }
        }
        if(dp[i][target]!=-1){
            return dp[i][target];
        }
        int notpick=change(coins,target,i+1,dp);
        int pick=795346593;
        if(target>=coins[i]){
            pick=1+change(coins,target-coins[i],i,dp);
        }
        return dp[i][target]=Math.min(notpick,pick);
    }
}