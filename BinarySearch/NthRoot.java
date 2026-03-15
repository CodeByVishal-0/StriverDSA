package BinarySearch;

public class NthRoot {
    public static void main(String[]args){
        System.out.println(root(16,4));
    }
    public static int root(int x, int p){
        int start=1;
        int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            int pow=(int)Math.pow(mid,p);
            if(pow==x){
                return mid;
            }else if(pow>x){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
