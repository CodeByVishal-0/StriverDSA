import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args){
        int[] nums={2,1,3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void nextPermutation(int[] nums) {
        int min = -1;
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                min = i - 1;
                break;
            }
        }
        int sub=min;
        if (min != -1) {
            for(int i=nums.length-1;i>sub;i--){
                if(nums[i]>nums[sub]){
                    sub=i;
                    break;
                }
            }
            int temp = nums[sub];
            nums[sub] = nums[min];
            nums[min] = temp;
            int i=min+1;
            int j=nums.length-1;
            reverse(nums,i,j);
        } else if (min == -1) {
            reverse(nums, 0, nums.length - 1);
        }
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
