class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        HashMap<String, Integer> mapList1 = new HashMap<>();
        
        //To store required set of string
        List<String> result = new ArrayList<>();
        int minIndexSum = Integer.MAX_VALUE;
        
        for(int i = 0; i< list1.length;i++){
            mapList1.put(list1[i], i);
        }
        
        for(int i=0; i<list2.length; i++){
            if(mapList1.containsKey(list2[i])){
                int indexSum = mapList1.get(list2[i])+ i;
                //checking indexSum with minIndexSum to add items to result
                if(minIndexSum > indexSum){
                    result.clear();
                    result.add(list2[i]);
                    minIndexSum = indexSum;
                } else if(minIndexSum == indexSum){
                    result.add(list2[i]);
                }
            }
        }
        
        //converting list of result to array. 
       return result.toArray(new String[result.size()]); 
        
    }
}