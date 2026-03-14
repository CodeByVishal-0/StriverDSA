package Array;
import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args){
        int[] nums={0,3,5,7,2,1};
        System.out.println(longestConsecutive(nums));

    }public static int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int lastSmall=Integer.MAX_VALUE;
        int count=1;
        int longest=1;
        for(int i=0;i<nums.length;i++){
            if(lastSmall!=nums[i]&&nums[i]-lastSmall==1){
                count++;
                lastSmall=nums[i];
                longest=Math.max(count,longest);
            }else if(nums[i]==lastSmall){
                continue;
            }else{
                lastSmall=nums[i];
                count=1;
            }
        }
        return longest;

    }
}
