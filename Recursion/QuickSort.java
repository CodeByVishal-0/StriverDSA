package Recursion;
import java.util.*;
public class QuickSort {
    public static void main(String[] args){
        int [] nums={8,7,9,6,5,3,4,2,1};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void quickSort(int[] nums,int low,int high){
        if(low>=high){
            return ;
        }
        int i=low;
        int j=high;
        int pivot=nums[low];
        while(i<j){
            while(nums[i]<=pivot&&i<=high){
                i++;
            }
            while(nums[j]>pivot&&j>=low){
                j--;
            }
            if(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp=nums[low];
        nums[low]=nums[j];
        nums[j]=temp;
        quickSort(nums,low,j-1);
        quickSort(nums,j+1,high);

    }
}
