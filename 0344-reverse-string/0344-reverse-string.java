class Solution {
    public void reverseString(char[] s) {
        //define variables for loops
        int left= 0;
        int right = s.length-1;
        
        // Looping through array to reverse it
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++; right--;
        }
        
        
    }
}