package BinarySearch;

public class RotatedSortedArrayII {
    public static void main(String[] args){
        int[] nums={1,0,1,1,1};
        int target=0;
        int start=0;
        int end =nums.length-1;
        int flag=0;
        //check which part is sorted
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                flag=1;
                break;
            }
            //shrink the search space
            else if(nums[start]==nums[mid]&&nums[mid]==nums[end]){
                start++;
            }
            else if(nums[start]<=nums[mid]){
                if(nums[start]<=target&&nums[mid]>target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            else{
                if(nums[end]>=target&&nums[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        if(flag!=1){

            System.out.println(-1);
        }
    }
}
