package TwoPointerandSlidingWindow;

import java.util.HashMap;

class LongestSubstringWithAtMostKSubstringCharacters{
    public static void main(String[] args) {
        String s="aaabbccd";
        int k=2;
        System.out.println(longestDistinctSubstring(s, k));
    }
    public static int longestDistinctSubstring(String s,int k){
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0;
        int r=0;
        int max=0;
        while(r<s.length()){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(map.size()>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            max=Math.max(r-l+1,max);
            r++;
        }
        return max;
    }
}