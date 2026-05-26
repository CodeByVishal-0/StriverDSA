package TwoPointerandSlidingWindow;

import java.util.HashMap;

public class SubarraysWithKDifferentInteger {
    public static void main(String[] args) {
        int[] nums={1,2,1,2,3};
        int k=2;
        System.out.println(subarraysWithKDistinct(nums, k));
    }
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    public static int helper(int[] nums,int k){
        if(k<0){
            return 0;
        }
        int l=0;
        int r=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        int count=0;
        while(r<nums.length){
            int num=nums[r];
            map.put(nums[r],map.getOrDefault(num,0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
}
