class Solution {
    public int removeDuplicates(int[] nums) {
        //Edge Case
        if(nums.length == 0) return 0;
        //unique index to store unique integers
        int index = 1;

        for(int i=1; i< nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    
}