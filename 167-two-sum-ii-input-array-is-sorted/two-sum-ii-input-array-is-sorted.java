class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Same approach as normal  Two Sum Problem...
        Map<Integer, Integer> hm = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i< numbers.length; i++){
            if(!hm.containsKey(target - numbers[i])){
                hm.put(numbers[i], i);
            }
            else{
                result[0]=hm.get(target- numbers[i])+1;
                result[1] = i+1;
                return result;
            }
        }
        return result;

      
    }
}