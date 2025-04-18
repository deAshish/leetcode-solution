class Solution {
    public int removeDuplicates(int[] nums) {
      int index=0, freq = 1, check =nums[0];
      nums[index++] = nums[0];
      for(int i=0; i< nums.length-1; i++){
        if(nums[i] == nums[i+1] && freq < 2){
            nums[index++] = nums[i+1];
            freq++;
        }
        else if(nums[i] < nums[i+1] && freq < 2){
            nums[index++] = nums[i+1];
            freq =1;
        
        }
        else if(nums[i] != nums[i+1]){
            nums[index++]=nums[i+1];
            freq = 1;
        
        }
      }
    
      return index;
    }
}