package TwoPointerandSlidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s="AABABBA";
        int k=1;
        System.out.println(characterReplacement(s,k));
    }
    public static int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int max=0;
        int maxFreq=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<s.length()){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,map.get(ch));
            int changes=(r-l+1)-maxFreq;
            if(changes>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
                changes=(r-l+1)-maxFreq;
            }
            max=Math.max(r-l+1,max);
            r++;
        }
        return max;
    }
}
