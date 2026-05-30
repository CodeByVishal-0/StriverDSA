package PrefixSum;

import java.util.HashMap;

public class ContiguousArray {
    public static void main(String[] args) {
        int[] nums={0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(nums));
        
    }
    public static int findMaxLength(int[] nums) {
        int zeroes = 0;
        int ones = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes++;
            } else {
                ones++;
            }
            int diff = zeroes - ones;
            if (diff == 0) {
                maxLength = Math.max(maxLength, i + 1);
            } else {
                if (!map.containsKey(diff)) {
                    map.put(diff, i);
                }
                if (map.containsKey(diff)) {
                    maxLength = Math.max(maxLength, i - map.get(diff));
                }
            }

        }
        return maxLength;
    }
}
