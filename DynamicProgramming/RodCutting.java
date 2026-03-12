package DynamicProgramming;
import java.util.*;
public class RodCutting {
    public static void main(String[] args){
        int[] cost={2,5,7,8,10};
        int length=5;
        int[][] dp = new int[cost.length][length+1];
        for(int[] arr:dp){
            Arrays.fill(arr, -1);
        }
        System.out.println(maxProfit(cost,length,0,dp));
    }
    public static int maxProfit(int[] cost, int length,int i,int[][] dp){
        if(i==cost.length){
            if(length==0){
                return 0;
            }else{
                return Integer.MIN_VALUE;
            }
        }
        if(dp[i][length]!=-1){
            return dp[i][length];
        }
        int notcut=maxProfit(cost,length,i+1,dp);
        int cut=0;
        if(length >= i+1){
            cut = cost[i] + maxProfit(cost, length - (i+1), i,dp);
        }
        return dp[i][length]=Math.max(notcut, cut);
    }
}
