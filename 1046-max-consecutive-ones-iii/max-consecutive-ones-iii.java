class Solution {
    public int longestOnes(int[] nums, int k) {
        //using two pointer left and right
        int left=0, countZero =0, result=k;

        for(int right=0; right< nums.length; right++){
            // if encounter any zero, increase countZero
            if(nums[right] ==0){
                countZero++;
            }
            // when counter is greater than k, and value at left is 0 increase left index and decrease counter.
            while (countZero >k){
                if(nums[left] ==0){
                countZero--;
            }
            left++;
            }
            //update result with every interation
            result = Math.max(result, right-left+1);
        }
        return result;
    }
}