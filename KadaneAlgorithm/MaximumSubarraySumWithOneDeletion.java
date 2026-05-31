package KadaneAlgorithm;

public class MaximumSubarraySumWithOneDeletion {
    public static void main(String[] args) {
        int[] nums={1,-2,0,3};
        System.out.println(maximumSum(nums));
    }
    public static int maximumSum(int[] nums) {
        int oneDelete=0;
        int noDelete=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            oneDelete=Math.max(noDelete,oneDelete+nums[i]);
            noDelete=Math.max(nums[i],noDelete+nums[i]);
            ans=Math.max(ans,Math.max(oneDelete,noDelete));
        }
        return ans;
    }
}