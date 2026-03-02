
package Recursion;
import java.util.*;
public class CombinationSum {
    public static void main(String[] args){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        int[] nums={2,3,6,7};
        helper(nums,0,7,ans,list);
        System.out.println(ans);


    }
    public static void helper(int[] nums, int n,int target, List<List<Integer>> ans,List<Integer> list){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return ;
        }
        if(n>nums.length-1||target<0){
            return ;
        }

        list.add(nums[n]);
        helper(nums,n,target-nums[n],ans,list);
        list.remove(list.size()-1);
        helper(nums,n+1,target,ans,list);
    }
}
