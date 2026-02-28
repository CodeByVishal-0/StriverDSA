public class MissingNumber {
    public static void main(String[] args){
        int[] nums={1,2,4,5};
        // method 1
        int n=nums.length+1;
        int sum=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum2=sum2+nums[i];
        }
        // method 2
        int xor=0;
        int xor2=0;
        for(int i=1;i<=n;i++){
            xor=xor^i;
        }
        for(int i=0;i<nums.length;i++){
            xor2=xor2^nums[i];
        }
        System.out.println(sum-sum2);
        System.out.println(xor^xor2);
    }
}
