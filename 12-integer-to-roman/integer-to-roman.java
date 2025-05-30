class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> hm = new LinkedHashMap<>();
        hm.put(1000, "M");
        hm.put(900,  "CM");           
        hm.put(500,  "D");
        hm.put(400,  "CD");
        hm.put(100,  "C");
        hm.put(90,   "XC");
        hm.put(50,   "L");
        hm.put(40,   "XL");
        hm.put(10,   "X");
        hm.put(9,    "IX");
        hm.put(5,    "V");
        hm.put(4,    "IV");
        hm.put(1,    "I");
        StringBuilder result = new StringBuilder();
        
        for(Map.Entry<Integer, String> entry : hm.entrySet()){
            while(num >= entry.getKey()){
                result.append(entry.getValue());
                num -=entry.getKey();

            }
        }
        return result.toString();
        
    }
}