class Solution {
    public int minPathSum(int[][] grid) {
        int m= grid.length,n=grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row: dp) Arrays.fill(row,-1);
        return solve(0,0,m-1,n-1,grid,dp);
    }
    public int solve(int r,int c,int m,int n,int[][] grid,int dp[][])
    {
        if(r==m && c==n) return grid[r][c];
        if(dp[r][c]!=-1) return dp[r][c];
        int right = Integer.MAX_VALUE, down = Integer.MAX_VALUE;
        if(c+1<=n) right = solve(r,c+1,m,n,grid,dp);
        if(r+1<=m) down = solve(r+1,c,m,n,grid,dp);
        return dp[r][c] = grid[r][c] + Math.min(right,down);
    }
}