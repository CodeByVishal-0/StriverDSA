package DynamicProgramming;

import java.util.Arrays;

public class KnapSack {
    public static void main(String[] args){
        int[] wt={3,2,5};
        int[] val={30,40,60};
        int bag=6;
        int[][] dp = new int[wt.length][bag+1];
        for(int arr[]:dp){
            Arrays.fill(arr, -1);
        }
        System.out.println(maxProfit(wt,val,0,bag,dp));

    }
    public static int maxProfit(int[] wt,int[] val,int i, int bag,int[][] dp){
        if(i==val.length){
            return 0;
        }
        if(dp[i][bag]!=-1){
            return dp[i][bag];
        }
        int notpick=maxProfit(wt,val,i+1,bag,dp);
        int pick=0;
        if(bag>=wt[i]){
            pick=val[i]+maxProfit(wt,val,i+1,bag-wt[i],dp);
        }
        return dp[i][bag]=Math.max(pick,notpick);

    }
}
