class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        int maxFrequency = 1;
        int requiredValue = nums[0];
        
        for(int num: nums){
                elements.put(num, elements.getOrDefault(num, 0) + 1);
                
                if(maxFrequency < elements.get(num)){
                    maxFrequency = elements.get(num);
                    requiredValue = num;
                }   
        }
        return requiredValue;
    }
}