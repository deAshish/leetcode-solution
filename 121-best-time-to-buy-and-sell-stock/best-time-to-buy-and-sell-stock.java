class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 1)
            return 0;
        
       //minimum value initialization
        int minValue = prices[0];
        //max profit initialization
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            //updating minimum value if any
            minValue = Math.min(minValue, prices[i]);
            //updating max value if any
            maxProfit= Math.max(maxProfit, prices[i] - minValue);
        }
        return maxProfit;
    }
}