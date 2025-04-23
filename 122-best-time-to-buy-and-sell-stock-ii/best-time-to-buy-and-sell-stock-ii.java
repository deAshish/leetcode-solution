class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            //Check if stock on current day is greater than previous day.
            if(prices[i] > prices[i-1]){
                profit +=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}