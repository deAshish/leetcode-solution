class Solution {
    public int romanToInt(String s) {

        // Mapping romain character to their respective values.
        Map<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        // Var to store result
        int result = 0;

        for(int i=0; i< s.length(); i++){
            int currentVal = hm.get(s.charAt(i));

            if(i>0 && hm.get(s.charAt(i-1)) < currentVal){
                // subtract the previous added value and subtract it again for correct difference
                result += currentVal - 2* hm.get(s.charAt(i-1));
            }
            else{
                result +=currentVal;
            }
        }
        return result; 
    }
}