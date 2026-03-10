package BinarySearch;

public class RotatedSortedArray {
    public static void main(String[] args){
        int[] nums={6,7,8,1,2,4};
        int target=6;
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
