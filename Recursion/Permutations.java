package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args){
        int[ ]nums={1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        helper(nums,0,list,ans);
        System.out.println(ans);

    } 
    public static void helper(int[] nums,int idx,List<Integer> list,List<List<Integer>> ans ){
        int n=nums.length;
        if(idx==n){
            ans.add(new ArrayList<>(list));
            return ;
        }
        for(int i=idx;i<n;i++){
            swap(nums,i,idx);
            list.add(nums[idx]);
            helper(nums,idx+1,list,ans);
            list.remove(list.size()-1);
            swap(nums,i,idx);
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
