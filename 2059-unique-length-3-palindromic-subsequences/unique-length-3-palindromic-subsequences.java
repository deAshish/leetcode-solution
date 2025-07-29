class Solution {
    public int countPalindromicSubsequence(String s) {
        int result =0; 
        int n = s.length();

        for(char ch='a'; ch <='z'; ch++){
            //get first index of a character
            int first = s.indexOf(ch);
            //get last index of a character
            int last = s.lastIndexOf(ch);

            if(first < last){
                
                Set<Character> uniqueMiddles = new HashSet<>();
                //get all unique character between outer character
                for(int i= first+1; i<last; i++){
                    uniqueMiddles.add(s.charAt(i));
                }
                //Add size of uniqueMiddles to result
                result += uniqueMiddles.size(); 
            }

        }
        return result;
    }
}