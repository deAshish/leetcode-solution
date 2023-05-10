class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> subString = new HashSet<>();
        int left =0, result=0;
        for(int i=0;  i<s.length(); i++){
            while(subString.contains(s.charAt(i))){
                subString.remove(s.charAt(left));
                left++;
            }
            subString.add(s.charAt(i));
            result = Math.max(result, i-left+1);
        }
        return result;
    }
}