package DynamicProgramming;

import java.util.Arrays;

public class StockBuySell_IV {
    public static void main(String[] args){
        int[] prices={3,2,6,5,0,3};

        //k is no. of transactions
        int k=3;

        int[][][] dp =new  int[prices.length][2][k];
        for(int[][] mat:dp){
            for(int[] arr:mat){
                Arrays.fill(arr,-1);
            }
        }
        System.out.println(max(prices,0,0,k-1,dp));
    }
    public static int max(int[] prices,int i,int buy,int t,int[][][] dp){
        if(t==-1){
            return 0;
        }
        if(i==prices.length){
            return 0;
        }
        if(dp[i][buy][t]!=-1){
            return dp[i][buy][t];
        }
        int profit=0;
        //buy
        if(buy==0){
            profit=Math.max(-prices[i]+max(prices,i+1,1,t,dp),max(prices,i+1,0,t,dp));
        }
        //sell
        else if(buy==1){
            profit=Math.max(prices[i]+max(prices,i+1,0,t-1,dp),max(prices,i+1,1,t,dp));
        }
        return dp[i][buy][t]=profit;
    }
}
