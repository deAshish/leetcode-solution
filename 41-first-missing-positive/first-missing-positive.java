class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> positiveSet = new TreeSet<>();
        for(int i=0; i< nums.length; i++){
            if(nums[i] >0){
                positiveSet.add(nums[i]);
            }
        }
        
        int check =1;
        for(Integer positiveDigit: positiveSet){
            if(positiveDigit >  check){
                break;
            }
            else{
                check++;
            }
        }
        return check;
    }
}