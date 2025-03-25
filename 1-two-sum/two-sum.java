class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<n;i++){
            if(mp.containsKey(target-nums[i])){
                ans[1]=i;
                ans[0]=mp.get(target-nums[i]);
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
}