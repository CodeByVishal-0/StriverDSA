package Recursion;

public class CountInversions {
    public static void main(String[] args){
        int[] nums={5,3,2,1,4};
        System.out.println(sort(nums,0,nums.length-1));
    }
    public static int sort(int[] nums, int start, int end) {
        int count=0;
        if (start >= end) {
            return count;
        }
        int mid = start + (end - start) / 2;
        int left=sort(nums, start, mid);
        int right=sort(nums, mid + 1, end);
        count+=merge(nums, start, mid, end);
        return (count+left+right);

    }

    public static int merge(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end-start+1];
        int p1 = start;
        int p2 = mid+1;
        int i = 0;
        int count=0;
        while (p1 <= mid && p2 <= end) {
            if (nums[p1] <= nums[p2]) {
                temp[i] = nums[p1];
                p1++;
            } else {
                //only change in merge sort.
                count+=(mid-p1+1);
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
        return count;
    }
}
