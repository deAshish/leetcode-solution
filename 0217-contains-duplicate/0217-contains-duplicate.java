class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i< nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i], 1);
            }
            else{
                result = true;
                break;
            }
                
        }
        return result;
    }
}