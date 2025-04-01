class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int rem = 0;
        rem  = money - (prices[0]+prices[1]);
        if(rem<0) return money;
        return  rem;
    }
}