class Solution {
    public int maxSubArray(int[] nums) {
        // initialization for result and max sum
        int result = nums[0], maxSum = nums[0];

        for(int i =1; i < nums.length;i++){

            //finding max sum for subarray
            maxSum = Math.max(maxSum + nums[i], nums[i]);

            // getting result with comparing with previous result
            result = Math.max(maxSum, result);
        }
        return result;
    }
}