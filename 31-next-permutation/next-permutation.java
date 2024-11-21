class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        //finding pivot index
        int pivot = -1;
        for(int i = n-2; i >=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
            // if no pivot found, just reverse the given array
            if(pivot == -1){
                reverse(nums, 0, n-1);
                return;
            }

            // if pivot found, loop from length-1 to pivot to check if any value is greater than 
            // pivot value, if so swap those two.
            for(int i= n-1; i > pivot; i--){
                if(nums[i] > nums[pivot]){
                    swap(nums, i, pivot);
                    break;
                }
        }
        reverse(nums, pivot+1, n-1);
    }

        public static void reverse(int[] nums, int start, int end){
           while(start < end){
            swap(nums, start++, end--);
           } 
        }

        public static void swap(int[] nums, int a, int b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
}