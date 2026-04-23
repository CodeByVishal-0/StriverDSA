package TwoPointerandSlidingWindow;

public class LongestSubarrayWithSumEqualsK {
   public static void main(String[] args) {
        int [] nums={2,5,1,10,10};
        int k=6;
        int max=0;
        int sum=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>k){
                sum-=nums[i];
                i++;
            }
            if(sum<=k){
                max=Math.max(j-i+1,max);
            }
            j++;
        }
        System.out.println(max);
    }

}
