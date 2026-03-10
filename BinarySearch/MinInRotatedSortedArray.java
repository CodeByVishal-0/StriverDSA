package BinarySearch;

public class MinInRotatedSortedArray {
    public static void main(String[] args){
        int[] nums={3,4,5,1,2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[start]<=nums[mid]){
                ans=Math.min(nums[start],ans);
                start=mid+1;
            }
            else if(nums[start]>nums[mid]){
                ans=Math.min(nums[mid],ans);
                end=mid-1;
            }
        }
        return ans;
    }
}
