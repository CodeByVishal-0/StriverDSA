public class MajorityElement {
    public static void main(String[] args){
        int[] nums={2,2,3,3,1,2,2};
        int num=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num){
                count++;
            }
            if(nums[i]!=num){
                count--;
            }
            if(count<0){
                num=nums[i];
                count++;
            }
        }
        System.out.println(num);
    }
}
