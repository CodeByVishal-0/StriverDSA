public class RemoveDupliactes {
    public static void main(String[] args){
        int[] nums={0,0,1,1,3,3,4,5,6,7,7};
        int i=0;
        int j=0;
        while(j!=nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                i++;
                int temp=nums[i];
                nums[i]=nums[j];

                nums[j]=temp;
                j++;
            }
        }
        for(int k=0;k<=i;k++){
            System.out.println(nums[k]);
        }
    }
}
