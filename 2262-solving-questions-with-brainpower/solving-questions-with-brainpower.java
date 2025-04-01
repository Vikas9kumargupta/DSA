class Solution {
    static long dp[];
    public long mostPoints(int[][] arr) {
        dp = new long[arr.length];
        Arrays.fill(dp,-1);
        return  help(arr,0);      
    }
    public static long help(int arr[][],int index){
        if(index>=arr.length) return 0;
        if(dp[index] != -1) return dp[index];
        long pick = arr[index][0]+help(arr,index+arr[index][1]+1);
        long notpick=help(arr,index+1);
       return dp[index]= Math.max(pick,notpick);
    }
}