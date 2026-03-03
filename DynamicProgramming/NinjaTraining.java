package DynamicProgramming;
import java.util.*;
public class NinjaTraining {
    public static void main(String[] args){
        int[][] nums={{18,11,19},{4,13,7}};
        int[][] dp = new int[nums.length][nums[0].length];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
        
        int ans=ninja(nums,0,-1,dp);
        System.out.println(ans);
        
    }
    public static int ninja(int [][] nums,int day,int task,int[][] dp){
        if(day==nums.length){
            return 0;
        }
        if(task!=-1 && dp[day][task]!=-1){
            return dp[day][task];
        }
        int maxPoints=0;
        for(int i=0;i<nums[0].length;i++){
            if(i==task){
                continue;
            }
            maxPoints=Math.max(maxPoints,nums[day][i]+ninja(nums,day+1,i,dp));
        }
        if(task != -1) {
            dp[day][task] = maxPoints;
        }

        return maxPoints;
    }
}
