class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = {-1, -1};
        int n = numbers.length;
        int start = 0;
        int end = n-1;
        while(start<end){
            int sum = numbers[start]+numbers[end];
            if(sum==target){
                ans[0] = start +1;
                ans[1] = end +1;
                break;
            }else if(sum<target){
                start++;
            }else{
                end--;
            }
        }
        return ans;
    }
}