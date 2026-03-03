package DynamicProgramming;

public class UniquePath1 {
    public static void main(String[] args){
        int m=7;
        int n=5;
        int[][] dp =new int[m][n];
        int ans= paths(m-1,n-1,dp);
        System.out.println(ans);
    }
    public static int paths(int m,int n,int[][] dp){
        if(m==0&&n==0){
            return 1;
        }
        if(n<0||m<0){
            return 0;
        }
        if(dp[m][n]!=0){
            return dp[m][n];
        }
        int d=paths(m-1,n,dp);
        int r=paths(m,n-1,dp);
        return dp[m][n]=d+r;
    }
}
