class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
	    int min = prices[0];
	    for(int i=1;i<prices.length;i++){
            int curProfit = prices[i] - min;
            maxProfit = Math.max(maxProfit,curProfit);
            min = Math.min(min,prices[i]);
        }
	    return maxProfit;
    }
}
