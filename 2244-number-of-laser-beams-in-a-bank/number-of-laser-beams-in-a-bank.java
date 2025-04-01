class Solution {
    public int numberOfBeams(String[] bank) {
        if (bank.length < 2) {
            return 0;
        }

        int ans = 0;
        int beaconsInPR = 0;
        int beaconsInCR = 0;
        for (String row : bank) {
            beaconsInCR = 0;
            for (char c : row.toCharArray()) {
                if (c == '1') {
                    beaconsInCR++;
                }
            }
            ans += beaconsInCR * beaconsInPR;
            beaconsInPR = beaconsInCR == 0 ? beaconsInPR : beaconsInCR;
        }

        return ans;
    }
}