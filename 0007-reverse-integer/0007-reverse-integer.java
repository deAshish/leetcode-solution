class Solution {
    public int reverse(int x) {
        long result = 0;
        while(x != 0){ 
            result = result *10+ x%10;
             if(Integer.MIN_VALUE >= result || result >= Integer.MAX_VALUE)
                return 0;
            x=x/10;
        }
       
        
        return (int) result;
    }
}