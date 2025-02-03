class Solution {
    public int myAtoi(String s) {
        int sign =1, result=0, idx=0;

        //Scanning for whitespace
        while(s.length() > idx && s.charAt(idx)== ' '){
            idx++;
        }
        //checking sign
        if(s.length() > idx && (s.charAt(idx) == '-'|| s.charAt(idx)== '+')){
            if(s.charAt(idx++) == '-'){
                sign = -1;
            }
        }
        //making valid integer
        while(s.length() > idx && (s.charAt(idx) <= '9' && s.charAt(idx) >='0')){
            //Checking for overflow or underflow of result
            if(result > Integer.MAX_VALUE/10 || 
            (result == Integer.MAX_VALUE/10 && s.charAt(idx) -'0' >7)){
                return sign == 1? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result *10 + (s.charAt(idx++) - '0');
        }
        return result*sign;

    }
}