package TwoPointerandSlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class SlindingWindows {
    public static void main(String[] args) {
        int[] nums ={-1,2,3,3,4,5,-1};
        int k=4;
        int sum=0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        int i=0;
        int j=i+k;
        while(j<nums.length){
            list.add(sum);
            sum=sum-nums[i]+nums[j];
            i++;
            j++;
        }
        list.add(sum);
        System.out.println(list);
    }
}
