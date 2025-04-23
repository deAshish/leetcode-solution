class Solution {
    public int jump(int[] nums) {
        int jump =0, currentEnd = 0, farEnd = 0;

        for(int i=0; i< nums.length-1; i++){
            farEnd = Math.max(farEnd, i+nums[i]);

            if(i == currentEnd){
                jump++;
                currentEnd = farEnd;
            }
        }

        return jump;
    }
}