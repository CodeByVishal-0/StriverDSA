package DynamicProgramming.PartitionDP;

import java.util.Arrays;

public class MatrixChainMultiplication {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50,60};
        int[][] dp = new int[arr.length][arr.length];
        for(int[] mat:dp){
            Arrays.fill(mat,-1);
        }
        System.out.println(matrixChain(arr,1,arr.length-1,dp));
;
    }
    public static int matrixChain(int[] arr,int i,int j,int[][] dp){
        if(i==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int steps=arr[i-1]*arr[k]*arr[j]+matrixChain(arr,i,k,dp);
            min=Math.min(steps,min);
        }
        return dp[i][j]=min;

    }

}
