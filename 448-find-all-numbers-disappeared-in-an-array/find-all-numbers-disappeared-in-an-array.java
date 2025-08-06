class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n= nums.length;
        List<Integer> missingNumbers = new ArrayList<>();

        int idx =0;
        while(idx < n){
            int currentVal = nums[idx];
            if(currentVal <= n+1 && currentVal != nums[currentVal -1]){
                int temp = currentVal;
                nums[idx] = nums[currentVal-1];
                nums[currentVal-1] = temp;
            }else{
                idx++;
            }
        }

        for(int i=0; i< n; i++){
            if(nums[i] != i+1){
                missingNumbers.add(i+1);
            }
        }

        return missingNumbers;
    }
}