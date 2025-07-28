class Solution {
    public int waysToSplitArray(int[] nums) {
        long leftSum =0, rightSum=0, sum=0;
        int count =0;

        for(int n: nums) sum +=n;

        for(int i=0; i< nums.length-1; i++){
            leftSum += nums[i];
            rightSum = sum - leftSum;
            if(leftSum >= rightSum) count++; 
        }
        return count;
    }
}