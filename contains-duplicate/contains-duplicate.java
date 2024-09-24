class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        int count = 1;
        for(int key: nums){
            if(hashSet.contains(key)){
                count++;
                if(count >= 2)
                    return true;
            } 
            hashSet.add(key);
        }
        return false;
        
        
    }
}