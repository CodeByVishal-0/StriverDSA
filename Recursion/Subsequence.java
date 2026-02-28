package Recursion;
import java.util.*;
public class Subsequence{
    public static void main(String[] args){
        int[] nums= {1,2,1,1,2,4};
        int k=5;
        List<Integer> list= new ArrayList<>();
        subsequence(nums,0,0,list,k);
        System.out.println(count(nums,0,0,k));
    }
    public static void subsequence(int[] nums,int idx,int sum ,List<Integer> list,int k){
        if(idx==nums.length){
            if(sum==k){
                System.out.println(list);
            }
            return ;
        }
        list.add(nums[idx]);
        sum=sum+nums[idx];
        subsequence(nums,idx+1,sum,list,k);
        sum=sum-nums[idx];
        list.remove(list.size() - 1);
        subsequence(nums,idx+1,sum,list,k);

    }
    public static int count(int[] nums, int idx, int sum,int k){
        if(idx==nums.length){
            if(sum==k){
                return 1;
            }
            return 0;
        }
        sum=sum+nums[idx];
        int l=count(nums,idx+1,sum,k);
        sum=sum-nums[idx];
        int r = count(nums,idx+1,sum,k);
        return l+r;
    }
}