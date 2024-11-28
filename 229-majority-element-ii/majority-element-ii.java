class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n= nums.length;
        int majority = n/3;
        HashMap<Integer, Integer> elementCount = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int element: nums){
            elementCount.put(element, elementCount.getOrDefault(element, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: elementCount.entrySet()){
            if(entry.getValue() > majority){
                result.add(entry.getKey());
            }
        }

        if(result.size() == 2 && result.get(0) < result.get(1)){
            int temp = result.get(0);
            result.set(0, result.get(1));
            result.set(1, temp);
        }
        return result;
    }
}