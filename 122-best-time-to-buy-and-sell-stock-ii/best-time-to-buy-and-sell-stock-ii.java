class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        if (n == 0) return 0;
        return getMaximumProfitUtil(prices, 0, 0, n, dp);
    }

    static int getMaximumProfitUtil(int[] Arr, int ind, int buy, int n, int[][] dp) {
        if (ind == n) return 0;
        if (dp[ind][buy] != -1)
            return dp[ind][buy];

        int profit;
        if (buy == 0) { // We can buy the stock
            profit = Math.max(0 + getMaximumProfitUtil(Arr, ind + 1, 0, n, dp),
                    -Arr[ind] + getMaximumProfitUtil(Arr, ind + 1, 1, n, dp));
        } else { // We can sell the stock
            profit = Math.max(0 + getMaximumProfitUtil(Arr, ind + 1, 1, n, dp),
                    Arr[ind] + getMaximumProfitUtil(Arr, ind + 1, 0, n, dp));
        }
        dp[ind][buy] = profit;
        return profit;
    }
}