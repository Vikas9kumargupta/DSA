class Solution {
    public int rob(int[] nums) {

        //Space Optimization
        int n = nums.length;
        int prev2 = 0;
        int prev1 = nums[0];
        for(int i = 1; i<n; i++){
            int pick = nums[i];
            if(i>1){
                pick += prev2;  
            }
            int unpick = prev1;
            int curr = Math.max(pick, unpick);
            prev2 = prev1;
            prev1 = curr;

        }
        return prev1;
    }
}