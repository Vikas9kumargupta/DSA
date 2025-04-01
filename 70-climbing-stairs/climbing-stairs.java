class Solution {
    public int climbStairs(int n) {
        if(n==1 || n== 2){
            return n;
        }
        int fS = 1;
        int sS = 2;
        for(int i = 3; i<= n; i++){
            int cS = fS + sS;
            fS = sS;
            sS = cS;
        }
        return sS;
    }
}