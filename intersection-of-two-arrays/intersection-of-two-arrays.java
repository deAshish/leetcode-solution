class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     // Input: nums1 = [1,2,2,1], nums2 = [2,2]
    // Output: [2]
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int num: nums1){
            set1.add(num);
        }
         for(int num: nums2){
            set2.add(num);
        }
        
        //Retain only common elements in set1 i.e. intersection of Set1             and Set2
         set1.retainAll(set2);
        
        //converting result set to array
        int[] result = new int[set1.size()];
        int i = 0;
        for(int num:set1){
            result[i++] = num;
        }
        return result;
        
    }
}