class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int temp = x, y = 0;
        
        while(temp > 0){
           y = y * 10 + temp % 10;
            
            temp= temp/10;
        }
        return x==y;
    }
}