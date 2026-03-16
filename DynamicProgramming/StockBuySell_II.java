package DynamicProgramming;

import java.util.Arrays;

public class StockBuySell_II {
    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
        int[][] dp = new int[prices.length][2];
        for(int [] arr:dp){
            Arrays.fill(arr,-1);
        }
        System.out.println( max(prices,0,0,dp));

    } 
    public static int max(int[] prices,int i,int buy,int[][] dp){
        if(i==prices.length){
            return 0;
        }
        if(dp[i][buy]!=-1){
            return dp[i][buy];
        }
        int profit=0;
        //buy
        if(buy==0){
            profit=Math.max(-prices[i]+max(prices,i+1,1,dp),max(prices,i+1,0,dp));
        }
        //sell
        else if(buy==1){
            profit=Math.max(prices[i]+max(prices,i+1,0,dp),max(prices,i+1,1,dp));
        }
        return dp[i][buy]=profit;
    }
}
