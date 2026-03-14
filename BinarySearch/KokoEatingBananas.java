package BinarySearch;

// https://leetcode.com/problems/koko-eating-bananas/description/


public class KokoEatingBananas {
    public static void main(String[] args){
        int[] piles={3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(piles,h));
    }
    public static  int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(piles[i], max);
        }
        int start = 1;
        int end = max;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int total = 0;
            for (int i = 0; i < piles.length; i++) {
                total +=Math.ceil((double)piles[i] / mid);
            }
            if (total <= h) {
                ans = mid;
                end = mid - 1;
            } else if (total > h) {
                start = mid + 1;
            }

        }
        return ans;
    }
}
