class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int[] result = new int[n];
        
        // calculate left product
        int left =1;
        for(int i=0; i< n;i++){
            result[i] =left;
            left *=nums[i];
        }

        //calculate right product
        int right = 1;
        for(int i=n-1; i>=0;i--){
            result[i] = result[i] * right;
            right *=nums[i];
        }
        
        //return result 
        return result;
    }
}