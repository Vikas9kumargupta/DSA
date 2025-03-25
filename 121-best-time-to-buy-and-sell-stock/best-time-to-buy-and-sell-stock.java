class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int currP = 0;
        for(int i = 0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            currP = prices[i]-min;
            profit = Math.max(profit, currP);

        }
        return profit;

    }
}
