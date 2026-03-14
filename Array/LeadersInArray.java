package Array;
import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args){
        int[] nums={10,22,12,3,0,6};
        List<Integer> list = new ArrayList<>();
        
        int max=nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>=max){
                list.add(nums[i]);
            }
            max=Math.max(max,nums[i]);
        }
        System.out.println(list);

    }
}
