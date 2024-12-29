class Solution {

    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;
        // Store product from left to right
        int leftToRight = 1;
        //store product from righ to left
        int rightToLeft = 1;

        for(int i=0; i < n; i++){
            if(leftToRight == 0){
                leftToRight = 1;
            }
            if(rightToLeft == 0){
                rightToLeft = 1;
            }
            //left to right product calculation
            leftToRight *=nums[i];
            
            //calculate product from right to left
            int j =n-i-1;
            rightToLeft *= nums[j];

            maxProduct = Math.max(leftToRight, Math.max(maxProduct, rightToLeft));
        }

        return maxProduct;
    }
}