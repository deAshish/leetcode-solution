class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // stores values of one array into hm
        List<Integer> resultList = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num: nums1){
            hm.put(num, hm.getOrDefault(num,0) +1);
        }
         //check for common repeated frequency   
        for(int num: nums2){
            if(hm.containsKey(num) && hm.get(num)>0){
                resultList.add(num);
                hm.put(num, hm.get(num) -1);
            }
        }
        
        // convert list into required array
        int result[] = new int[resultList.size()];
        for(int i=0; i< resultList.size(); i++){
            result[i] = resultList.get(i);
        }
       
        return result;
    }
}