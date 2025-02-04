class Solution {
    public int maxAscendingSum(int[] nums) {
        int result = nums[0], newSum =nums[0];

        for(int i=0; i< nums.length-1; i++){
            if(nums[i+1] > nums[i]){
                newSum +=nums[i+1];
                result = Math.max(newSum, result);
            }
            else{
                newSum = nums[i+1];
                result = Math.max(newSum, result);
            }
        }
        return result;
    }
}