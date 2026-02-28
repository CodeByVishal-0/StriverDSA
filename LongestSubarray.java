import java.util.*;

public class LongestSubarray {
    public static void main(String[] args){
        int[] nums={1,2,3,1,1,1,1};
        int k=3;
        Map<Integer,Integer> map = new HashMap<>();
        int preSum=0;
        int maxLen=0;
        for(int i=0;i<nums.length;i++){
            preSum=preSum+nums[i];
            if(preSum==k){
                maxLen=Math.max(maxLen,i+1);
            }
            int rem=preSum-k;
            if(map.containsKey(rem)){
                int len=i-map.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            map.put(preSum, i);
        }
        System.out.println(maxLen);

    }
}
