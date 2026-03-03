package Recursion;
import java.util.*;
public class SubsetSum {
    public static void main(String[] args){
        int[] nums={3,1,2};
        List<Integer> list = new ArrayList<>();
        helper(nums,0,0,list);
        Collections.sort(list);
        System.out.println((list));


    }
    public static void helper(int [] nums,int sum,int i,List<Integer> list){
        if(i==nums.length){
            list.add(sum);
            return;
        }
        helper(nums,sum,i+1,list);
        helper(nums,sum+nums[i],i+1,list);
    }
}
