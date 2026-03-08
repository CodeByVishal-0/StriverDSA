package DynamicProgramming;

import java.util.Arrays;

public class SubSetSumEqualsK {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int target = 10;

        int[][] dp = new int[nums.length][target + 1];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        System.out.println(subsetsum(nums, 0, target, dp));
    }
    public static boolean subsetsum(int[] nums, int idx, int target, int[][] dp){

        if(target == 0){
            return true;
        }

        if(idx == nums.length - 1){
            return nums[idx] == target;
        }

        if(dp[idx][target] != -1){
            return dp[idx][target] == 1;
        }

        boolean nottake = subsetsum(nums, idx + 1, target, dp);

        boolean take = false;
        if(nums[idx] <= target){
            take = subsetsum(nums, idx + 1, target - nums[idx], dp);
        }

        dp[idx][target] = (take || nottake) ? 1 : 0;

        return take || nottake;
    }
}