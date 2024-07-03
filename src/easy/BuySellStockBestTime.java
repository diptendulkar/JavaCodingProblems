package easy;

public class BuySellStockBestTime {
    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4}; //op 5
//        int[] prices ={2,4,1}; //op 2z
            int[] prices ={3,2,6,5,0,3}; //op 4
//        int[] prices = {1, 2, 4}; //op 3
        System.out.println(maxProfit2(prices));
    }

    public static int maxProfit2(int[] prices) {

        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyprice)
                buyprice = prices[i];

            profit = prices[i] - buyprice;

            if (maxprofit < profit)
                maxprofit = profit;
        }
        return maxprofit;
    }

    public static int maxProfit(int[] prices) {

        int left = 0, right = 1;
        int maxProfit = 0;
        while (left < prices.length - 1) {
            int profit = prices[right] - prices[left];
            maxProfit = Math.max(maxProfit, profit);
            right++;
            if (right >= prices.length) {
                left++;
                right = left + 1;
            }

        }
        return maxProfit;
    }
}
