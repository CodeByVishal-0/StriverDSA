package TwoPointerandSlidingWindow;

import java.util.*;
class LongestSubstringWithoutRepeatingCharacters{
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int max=0;
        Hashtable<Character,Integer> hash = new Hashtable<>();
        while(r!=s.length()){
            char ch=s.charAt(r);
            if(hash.containsKey(ch)){
                l = Math.max(l, hash.get(ch) + 1);
            }
            hash.put(ch,r);
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}