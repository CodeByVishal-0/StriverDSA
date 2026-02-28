import java.util.*;
public class Intersection {
    public static void main(String[] args){
        int[] nums1={1,2,3,3,4,5};
        int[] nums2= {1,2,4,5};
        List<Integer> list= new ArrayList<>();
        int i=0;
        int j=0;
        while(i!=nums1.length&&j!=nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums2[j]>nums1[i]){
                j++;
            }else if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        System.out.println(list);
    }
}
