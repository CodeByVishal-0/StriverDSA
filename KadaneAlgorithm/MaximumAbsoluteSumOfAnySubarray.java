package KadaneAlgorithm;

public class MaximumAbsoluteSumOfAnySubarray {
    public static void main(String[] args) {
        int[] nums={1,-3,2,3,-4};
        System.out.println(maxAbsoluteSum(nums));
    }
    public static int maxAbsoluteSum(int[] nums) {
        int minEnding=nums[0];
        int maxEnding=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            minEnding=Math.min(nums[i],nums[i]+minEnding);
            maxEnding=Math.max(nums[i],nums[i]+maxEnding);
            ans=Math.max(ans,Math.max(maxEnding,Math.abs(minEnding)));
        }
        return Math.abs(ans);

    }
}
