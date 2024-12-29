class Solution {
    //method to calculate max value at current index
    static int max(int i, int j, int k){
        return Math.max(i, Math.max(j,k));
    }
    //method to calculate min value at current index
    static int min(int i, int j, int k){
        return Math.min(i, Math.min(j,k));
    }

    public int maxProduct(int[] nums) {
        //initialization for max product value at current index
        int currentMax = nums[0];
        //initialization for min product value at current index
        int currentMin = nums[0];
        //overall maximum product value
        int maxProd = nums[0];

        for(int i=1; i< nums.length; i++){
            //calculate max at current index and assign to temp variable
            int temp = max(nums[i], nums[i]* currentMax, nums[i]*currentMin);
            //calculate min at current index
            currentMin = min(nums[i], nums[i]* currentMax, nums[i]*currentMin);
            //assign current max value from temp
            currentMax = temp;
            //update max product value if any
            maxProd = Math.max(maxProd, currentMax);
        }
        return maxProd;
    }
}