class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int j = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != val){
                count++;
                nums[j] = nums[i];
                j++;
            }
        }
        return count;
    }
}