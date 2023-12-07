class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int[] new_Array = new int[nums.length];
        new_Array[0] = nums[0];
        for(int i=0; i < nums.length - 1; i++){
            if(nums[i] != nums[i+1]){
                j++;
                new_Array[j] = nums[i+1];
            }
        }
        
        for(int k = 0; k < nums.length; k++){
            nums[k] = new_Array[k];
        }
        return j+1;
    }
}