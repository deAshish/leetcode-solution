class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int result = 0;
        // traverse through string to add each character into hashmap with value = repeated numbers.
        for(int i =0; i <s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            }else{
                hm.put(s.charAt(i), 1);
            }
        }
        // traverse through string to find out 1st non-repeated character
        for(int i=0; i<s.length(); i++){
            if(hm.get(s.charAt(i)) == 1)
                return i;
        }
        
        return -1;
    }
}