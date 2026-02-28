// package Striver;
import java.util.*;
public class RotateArray {
    public static void main(String[] args){
        int[] nums={1,2,4,5,6};
        // onePlace(nums);
        // kPlace(nums,3);
        // kPlaceBetter(nums,5);
        System.out.println(Arrays.toString(nums));
    }
    public static void onePlace(int[] nums){
        int temp =nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
    }
    //brute force
    public static void kPlace(int[] nums,int k){
        k=k%nums.length;
        while(k!=0){
            int temp =nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
        k--;
        }
    }
    //better appproach
    public static void kPlaceBetter(int[] nums,int k){
        k=k%nums.length;
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    public static void reverse(int[] nums,int l,int r){
        while(l<r){
            int temp =nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }


}