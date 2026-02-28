package Recursion;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int[] nums = { 5, 6, 7, 4, 2, 1 };
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }

    public static void sort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        sort(nums, start, mid);
        sort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    public static void merge(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end-start+1];
        int p1 = start;
        int p2 = mid+1;
        int i = 0;
        while (p1 <= mid && p2 <= end) {
            if (nums[p1] < nums[p2]) {
                temp[i] = nums[p1];
                p1++;
            } else {
                temp[i] = nums[p2];
                p2++;
            }
            i++;
        }
        while(p2<=end){
            temp[i]=nums[p2];
            p2++;
            i++;
        }
        while(p1<=mid){
            temp[i]=nums[p1];
            p1++;
            i++;
        }
        for(int j=0;j<temp.length;j++){
            nums[j+start]=temp[j];
        }
    }

}
