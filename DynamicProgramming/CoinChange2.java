package DynamicProgramming;

import java.util.Arrays;

class CoinChange2{
    public static void main(String[] args){
        int[] coins={9,6,5,1};
        int target=11;
        int[][] dp=new int[coins.length][target+1];
        for(int[] arr:dp){
            Arrays.fill(arr, -1);
        }
        System.out.println(changeCoin(coins,target,0,dp));
    }
    public static int changeCoin(int[] coins,int target,int i,int[][] dp){
        if(i==coins.length){
            if(target==0){
                return 1;
            }else{
                return 0; 
            }
        }
        if(dp[i][target]!=-1){
            return dp[i][target];
        }
        int notpick=changeCoin(coins,target,i+1,dp);
        int pick=0;
        if(target>=coins[i]){
            pick=changeCoin(coins,target-coins[i],i,dp);
        }
        return dp[i][target]=pick+notpick;
    }
}