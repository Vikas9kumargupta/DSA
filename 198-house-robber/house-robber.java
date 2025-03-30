class Solution {
    public int rob(int[] nums) {

        //Tabulation
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for(int i = 1; i<n; i++){
            int pick = nums[i];
            if(i>1){
                pick += dp[i-2];  
            }
            int unpick = dp[i-1];
            dp[i] = Math.max(pick, unpick);
        }
        return dp[n-1];
    }
}