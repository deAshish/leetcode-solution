class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[] twoNumber = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(target - nums[i], i);
            }
            else{
                twoNumber[0] = hm.get(nums[i]);
                twoNumber[1]= i;
                
            }
                            
        }
        return twoNumber;  
    }
}