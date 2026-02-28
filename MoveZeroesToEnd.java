import java.util.*;
public class MoveZeroesToEnd {
    public static void main(String[] args){
        int[] nums ={1,0,0,0,2,4,5,0,31,4,3,0};
        int i=0;
        int j=0;
        while(j!=nums.length){
            if(nums[j]!=0){
                int temp =nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
