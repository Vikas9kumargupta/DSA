class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int k = 0;
        for(int i = 0;i<n;i++){
            if(i > k){
                return false;
            }
            k = Math.max(k, i+nums[i]);
            if(k >= n-1){
                return true;
            }
        }
        return k >= n-1;
    }
}