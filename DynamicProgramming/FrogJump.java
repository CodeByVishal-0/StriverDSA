package DynamicProgramming;

public class FrogJump {
    public static void main(String[] args){
        int[] nums={30,10,60,10,60,50};
        int [] dp = new int[nums.length];
        System.out.println(frogJump(nums,nums.length-1,dp));

    }
    public static int frogJump(int[] nums, int n,int[] dp){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int l=Math.abs(nums[n]-nums[n-1])+frogJump(nums,n-1,dp);
        int r=9223;
        if(n>1){

            r=Math.abs(nums[n]-nums[n-2])+frogJump(nums,n-2,dp);
        }
        return dp[n]=Math.min(l,r);
    }
}
