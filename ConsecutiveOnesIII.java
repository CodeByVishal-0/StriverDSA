public class ConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(longestOnes(arr, k));
    }
    public static int longestOnes(int[] nums, int k) {
        int max=0;
        int l=0;
        int r=0;
        int zeroes=0;
        while(r<nums.length){
            if(nums[r]==0){
                zeroes++;
            }
            while(zeroes>k){
                if(nums[l]==0){
                    zeroes--;
                }
                l++;
            }
            max=Math.max(r-l+1,max);
            r++;

        }
        return max;
    }
}
