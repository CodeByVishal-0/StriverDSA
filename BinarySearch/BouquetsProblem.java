package BinarySearch;
// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/
public class BouquetsProblem {
    public static void main(String[] args){
        int[] bloomDay={1,10,3,10,2};
        int m=3;
        int k=1;
        System.out.println(minDays(bloomDay,m,k));
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        int max=0;
        int min=Integer.MAX_VALUE;
        if((long)m*k>bloomDay.length){
            return -1;
        }
        for(int i=0;i<bloomDay.length;i++){
            max=Math.max(bloomDay[i],max);
            min=Math.min(bloomDay[i],min);
        }
        int start=min;
        int end=max;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            int count=0;
            int bouquets=0;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    count++;
                }else{
                    bouquets+=count/k;
                    count=0;
                }
            }
            bouquets+=count/k;
            if(bouquets>=m){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
