package DynamicProgramming.DPonStrings;

import java.util.Arrays;

public class LongestStringChain {
    public static void main(String[] args) {
        String[] words={"xbc","pcxbcf","xb","cxbc","pcxbc"};
        System.out.println(longestStrChain(words));
    }
    public static int longestStrChain(String[] words) {
        int n=words.length;
        Arrays.sort(words,(a,b)->(a.length()-b.length()));
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(compare(words[j],words[i])){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
            max=Math.max(max,dp[i]);
        }
        return max;

    }
    public static boolean compare(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        if(n-m!=1){
            return false;
        }
        int i=0;
        int j=0;
        while(i<m&&j<n){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if((i==m&&j==n)||(i==m&&j==n-1)){
            return true;
        }
        return false;

    }
}
