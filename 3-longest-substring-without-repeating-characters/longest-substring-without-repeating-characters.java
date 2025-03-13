class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> longestSet = new HashSet<>();
        int left =0, maxLength =0;
        for(int i= 0; i <s.length(); i++){
        // If the character already present in the set, shrink the window from left untill that
        //    character is removed.
            while(longestSet.contains(s.charAt(i))){
                longestSet.remove(s.charAt(left));
                left++; // moving pointer rightwards to shrink the window.

            }
                //Add current character to the set since it is new in the window.
                longestSet.add(s.charAt(i));

                // max length calculation
                maxLength = Math.max(maxLength, i-left+1);
        }
        return maxLength;
    }
}