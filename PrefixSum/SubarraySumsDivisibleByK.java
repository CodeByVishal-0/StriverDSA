package PrefixSum;

import java.util.HashMap;

public class SubarraySumsDivisibleByK {
    public static void main(String[] args) {
        int[] nums={4,5,0,-2,-3,1};
        int k=7;
        System.out.println(subarraysDivByK(nums, k));
        
    }
    public static int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem = ((sum % k) + k) % k;
            if(map.containsKey(rem)){
                ans+=map.get((rem));
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return ans;
    }
}
