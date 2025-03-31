class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
    int[][] ahead = new int[2][3]; 
    int[][] curr = new int[2][3];  
    for (int ind = n - 1; ind >= 0; ind--) {
        for (int buy = 0; buy <= 1; buy++) {
            for (int cap = 1; cap <= 2; cap++) {
                if (buy == 0) {
                    curr[buy][cap] = Math.max(ahead[0][cap], -prices[ind] + ahead[1][cap]);
                } else {
                    curr[buy][cap] = Math.max(ahead[1][cap], prices[ind] + ahead[0][cap - 1]);
                }
            }
        }
        ahead = curr.clone();
    }
    return ahead[0][2];

    }
}