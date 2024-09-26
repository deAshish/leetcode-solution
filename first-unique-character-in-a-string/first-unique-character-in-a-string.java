class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int result = 0;
        // traverse through string to add each character into hashmap with value = repeated numbers.
        for(int i =0; i <s.length(); i++){
                hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        // traverse through string to find out 1st non-repeated character
        for(int i=0; i<s.length(); i++){
            if(hm.get(s.charAt(i)) == 1)
                return i;
        }
        
        return -1;
    }
}