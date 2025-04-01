class Solution {
    public int tribonacci(int n) {
        int prev3=0;
        int prev2=1;
        int prev1=1;
        int curr=0;

        if(n==0)return 0;
        if(n==1||n==2)return 1;

        while(n>=3){
            curr=prev3+prev2+prev1; 
            prev3=prev2;
            prev2=prev1;
            prev1=curr;
            n--;
        }
        return curr;
    }
}