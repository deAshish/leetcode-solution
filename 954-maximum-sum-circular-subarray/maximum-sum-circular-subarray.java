class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        //variable initialization 
        int totalSum =0, currentMaxSum=0, currentMinSum =0;
        int maxSum = nums[0], minSum = nums[0];

        for(int i=0; i< nums.length; i++){
            //total sum calculation
            totalSum += nums[i];

            // Calculation of max sum at current index
            currentMaxSum = Math.max(currentMaxSum +nums[i], nums[i]);
            maxSum = Math.max(maxSum, currentMaxSum);
            
            // Calculation of min sum at current index
            currentMinSum = Math.min(currentMinSum +nums[i], nums[i]);
            minSum = Math.min(currentMinSum, minSum);

        }
        
        int normalSum =maxSum;
        int cricularSum = totalSum - minSum;

        if(totalSum == minSum)
            return normalSum;
        
        return Math.max(normalSum, cricularSum);
    }
}