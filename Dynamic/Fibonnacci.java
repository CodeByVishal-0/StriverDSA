package Dynamic;

public class Fibonnacci {
    public static void main(String[] args){
        int n=9;
        int[] dp = new int[n+1];
        System.out.println(fib(n,dp));
        System.out.println(fib1(n,dp));
    }

    public static int fib(int n, int[] dp) {
        if(n<=1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n]=fib(n-1,dp)+fib(n-2,dp);
    }
    ///tabulation
    public static int fib1(int n,int[] dp){
        dp[1]=1;
        dp[0]=0;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}