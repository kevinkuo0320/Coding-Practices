public class BestBuy {

    //O(n) solution, choose backwards direction because can only sell after buy.
    //use counter to keep track the largest price from the back
    public int maxProfit(int[] prices) {

        int profit = 0;
        int counter = prices[prices.length-1];

        for(int i = prices.length - 1; i >= 0; i--){
            if(prices[i] > counter) {
                counter = prices[i];
            }

            profit = Math.max(profit, counter-prices[i]);
        }
        return profit;

    }
}
