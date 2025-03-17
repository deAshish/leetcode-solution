class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] result = new int[2];
        int left =0, right = numbers.length-1;
        while(left < right){
            //Use left and right pointer
            //Check if sum is greater, smaller or eqaul
            //If greater increase left pointer, smaller decrease right pointer.
            int current_Sum = numbers[left]+ numbers[right];
            if(current_Sum == target){
                result[0] = ++left;
                result[1] = ++right;
                return result;
            }

            else if(current_Sum < target){
                left++;

            }else{
                right--;

            }

        }
        return result;
    }
}