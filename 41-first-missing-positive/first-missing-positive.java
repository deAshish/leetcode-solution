class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // storing values to their correspoinding index
        for(int i=0; i< n; i++){
            while( nums[i] >=1 && nums[i] <= n && nums[i] != nums[nums[i] -1]){
                
                //swap value to its desire index
                int temp = nums[i];
                nums[i] = nums[nums[i] -1];
                nums[temp -1] =temp;
            }
        }

        //looping through array to find missing value
        for(int i=1; i <=n; i++){
            if(i != nums[i -1]){
                return i;
            }
        }
        return n+1;
    }
}