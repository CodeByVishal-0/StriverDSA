package Recursion;
import java.util.*;
public class PalindromePartitioning {
    public static void main(String[] args){
        String s="aab";
        List<List<String>> ans = new ArrayList<>();
        List<String> list= new ArrayList<>();
        helper(s,list,ans);
        System.out.println(ans);
        
    }
    public static void helper(String s,List<String> list,List<List<String>> ans ){
        if(s.length()==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<s.length();i++){
            String sub=s.substring(0,i+1);
            if(isPalindrome(sub)){
                list.add(sub);
                helper(s.substring(i+1),list,ans);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
