import java.util.Map.Entry;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        int maxFrequency = 1;
        int requiredValue = nums[0];
        
        for(int num: nums){
            
            if(elements.containsKey(num)){
                elements.put(num, elements.get(num) + 1);
                
                if(maxFrequency < elements.get(num)){
                    maxFrequency = elements.get(num);
                    requiredValue = num;
                } 
                    
            }
            else{
                elements.put(num, 1);
            }
        }
        
//         for(Entry<Integer, Integer> entry: elements.entrySet()){
//             if(entry.getValue() == maxFrequency)
//                 requiredValue = entry.getKey();
                
            
//         }
        
        return requiredValue;
        
    }
}