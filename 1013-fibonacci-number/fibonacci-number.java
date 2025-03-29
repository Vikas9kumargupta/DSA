class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        if(dp[n] != -1) return dp[n];
        return dp[n] = fib(n-1)+fib(n-2);
    }
}