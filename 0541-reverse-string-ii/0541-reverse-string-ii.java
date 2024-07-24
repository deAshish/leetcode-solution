class Solution {
    public String reverseStr(String s, int k) {
    
        char[] toArray = s.toCharArray();
        
        //loop for every 2k character
        for(int i =0; i < s.length(); i+= 2*k){
            int start = i;
            int end = Math.min(i+k-1, toArray.length-1);
            
            //reverse character with start position till end position
            while(start < end){
                char temp = toArray[start];
                toArray[start++] = toArray[end];
                toArray[end--] = temp;
            }
        }
        return new String(toArray);
    }
}