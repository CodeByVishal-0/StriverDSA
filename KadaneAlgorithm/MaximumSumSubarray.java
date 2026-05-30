package KadaneAlgorithm;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int sum=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>sum+nums[i]){
                sum=nums[i];
                max=Math.max(max,nums[i]);
            }else{
                sum+=nums[i];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}
