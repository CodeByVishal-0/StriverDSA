package Recursion;

public class Sqrt {
    public static void main(String[] args){
        System.out.println(mySqrt(50));
    }
    public static  int mySqrt(int x) {
        long start=1;
        long end=x;
        long ans=0;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid<=x){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        //or return end
        return (int)ans;
    }
}
