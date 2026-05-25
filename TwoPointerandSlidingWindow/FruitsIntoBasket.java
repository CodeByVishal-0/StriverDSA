package TwoPointerandSlidingWindow;

// Idea

// We need to find the longest subarray that contains at most 2 different fruits.
// The code checks every possible starting point and keeps adding fruits until there are more than 2 types.

import java.util.HashMap;
class FruitsIntoBasket{
    public static void main(String[] args) {
        int[] fruits={3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(totalFruit(fruits));
    }
    public static int totalFruit(int[] fruits) {
        int max=0;
        int l=0;
        int r=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r<fruits.length){
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            while(map.size()>2){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                }
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}