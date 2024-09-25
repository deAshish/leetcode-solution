class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for(int key: nums){
            if(hashSet.contains(key)){
                return true;
            } 
            hashSet.add(key);
        }
        return false; 
    }
}