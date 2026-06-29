class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int lowest = prices[0];
        for(int i = 1;i<prices.length;i++){
                lowest = Math.min(lowest,prices[i]);
                max = Math.max(max,prices[i] - lowest);
        }
        return max;
    }
}
