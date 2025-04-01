class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = getAns(prices, 0, 0, n, dp);
        return ans;
    }
    
    private int getAns(int[] arr, int ind, int buy, int n, int[][] dp) {
        if (ind >= n) {
            return 0;
        }
        if (dp[ind][buy] != -1) {
            return dp[ind][buy];
        }
        int profit = 0;
        if (buy == 0) { 
            profit = Math.max(0 + getAns(arr, ind + 1, 0, n, dp),
                    -arr[ind] + getAns(arr, ind + 1, 1, n, dp));
        }
        if (buy == 1) { // We can sell the stock
            profit = Math.max(0 + getAns(arr, ind + 1, 1, n, dp),
                    arr[ind] + getAns(arr, ind + 2, 0, n, dp));
        }
        dp[ind][buy] = profit;
        return profit;
    }
}