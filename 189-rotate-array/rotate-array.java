class Solution {
    public void rotate(int[] nums, int k) {
        int rotate = k% nums.length;
        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, rotate-1);
        reverseArray(nums, rotate, nums.length-1);
    }

    public static void reverseArray(int[] nums,int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}