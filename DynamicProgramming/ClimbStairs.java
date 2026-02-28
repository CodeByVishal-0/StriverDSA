package DynamicProgramming;

public class ClimbStairs {
    public static void main(String[] args){
        int n=10;
        int[] dp  = new int[n+1];
        System.out.println(climb(n,dp));
        System.out.println(climb2(n,dp));

    }
    public static int climb(int n, int [] dp ){
        if(n<=2){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n]=climb(n-1,dp)+climb(n-2,dp);

    }
    //tabulation
    public static int climb2(int n, int [] dp ){
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];

        }
        return dp[n];
    }

}
