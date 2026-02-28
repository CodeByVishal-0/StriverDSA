public class LongestSubarraySum {
    public static void main(String[] args){
        int[] nums={-2,-3,4,-1,-2,1,5,-3};
        int sum=0;
        int max=0;
        //for printing
        int start =0;
        int ansStart=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            if(sum==0){
                start=i;
            }
            sum=sum+nums[i];
            if(sum>max){
                max=sum;
                ansStart=start;
                end=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
        System.out.println(ansStart);
        System.out.println(end);
    }
}
