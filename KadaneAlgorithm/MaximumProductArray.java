package KadaneAlgorithm;

public class MaximumProductArray {
    public static void main(String[] args) {
        int[] nums={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int minEnding=nums[0];  
        int maxEnding=nums[0];  
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=nums[i]*minEnding;
            int v3=nums[i]*maxEnding;
            minEnding=Math.min(v3,Math.min(v1,v2));
            maxEnding=Math.max(v3,Math.max(v1,v2));
            ans=Math.max(ans,Math.max(minEnding,maxEnding));
        }
        return ans;
    }
}
