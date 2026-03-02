package Recursion;

public class KFrogJump {
    public static void main(String[] args){
        int[] nums={30,10,60,10,60,50};
        int [] dp = new int[nums.length];
        int k=5;
        System.out.println(frogJump(nums,nums.length-1,dp,k));

    }
    public static int frogJump(int[] nums, int n,int[] dp,int k){
        if(n==0){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int min=90909;
        for(int i=1;i<=k;i++){
            if(n-i>=0){

                min=Math.min(min,frogJump(nums,n-i,dp,k)+Math.abs(nums[n]-nums[n-i]));
            }
        }
        return dp[n]=min;
    }
}
