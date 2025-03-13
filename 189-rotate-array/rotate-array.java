class Solution {
    public void rotate(int[] nums, int k) {
        k= k%nums.length; // Handling k if it is greater than length of the array.
        makeRotation(nums, 0, nums.length-1);
         makeRotation(nums, 0, k-1 );
         makeRotation(nums, k, nums.length-1);
        
    }
    public static int[] makeRotation(int nums[], int left, int right){
        while(left <=right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;

        }
       return nums; 
    }
}