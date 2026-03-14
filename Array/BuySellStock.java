package Array;
public class BuySellStock {
    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
        System.out.println(profit(prices));
    }
    public static int profit(int[] prices){
        int min =prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++ ){
            int cost= prices[i]-min;
            profit=Math.max(cost,profit);
            min=Math.min(prices[i], min);
        }
        return profit;
    }
}
