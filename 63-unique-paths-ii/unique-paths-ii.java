class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if(grid[m-1][n-1]==1) return 0;
        int[][] dp = new int[m][n];
        for(int[] row:dp) Arrays.fill(row,-1);
        return rec(0,0,grid,m-1,n-1,dp);
    }
     private int rec(int r,int c,int[][] grid,int m,int n,int[][] dp)
    {
        if(r==m && c==n) return 1;
        if(r>m || c>n || (grid[r][c]==1)) return 0;
        if(dp[r][c]!=-1) return dp[r][c];
        int right = rec(r,c+1,grid,m,n,dp);
        int down = rec(r+1,c,grid,m,n,dp);
        return dp[r][c] = right + down;
    }

}
    