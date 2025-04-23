class Solution {
    public int maxProfit(int[] prices) {
        //store min value in the prices
        int minValue = prices[0];

        //store max profit
        int maxProfit = 0;

        for(int i=1; i<prices.length;i++){
            //update min value
            minValue = Math.min(minValue, prices[i]);

            //update max profit
            maxProfit = Math.max(maxProfit, prices[i] - minValue);
        }

        return maxProfit;
        
    }
}