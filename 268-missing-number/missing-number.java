class Solution {
    public int missingNumber(int[] nums) {
       int idx =0;

       while(idx < nums.length){
        int currentVal = nums[idx];
        if(currentVal < nums.length && currentVal != nums[currentVal]){
            int temp = nums[idx];
            nums[idx] = nums[currentVal];
            nums[currentVal] = temp;
        } else{
            idx++;
        }
       }

       for(int i=0; i< nums.length; i++){
        if(nums[i] != i){return i;}
       } 

       return nums.length;
       
    }
}