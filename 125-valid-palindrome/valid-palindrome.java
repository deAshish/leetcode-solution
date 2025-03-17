class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Boolean result = true;
        int left=0, right=s.length()-1;
        while(right >= left){
            if(s.charAt(left++) != s.charAt(right--)){
                result = false;

            }
        }
        return result;
    }
}