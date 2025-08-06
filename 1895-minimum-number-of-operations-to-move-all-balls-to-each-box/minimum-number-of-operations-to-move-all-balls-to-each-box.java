class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] result = new int[boxes.length()];

        for(int i=0; i< boxes.length(); i++){
            int temp =0;
            for(int j=0; j< boxes.length(); j++){
               
                    if(boxes.charAt(j)== '1'){
                        temp +=Math.abs(j-i);
                    }
                result[i] = temp;
        
        }
        }

        return result;
    }
    }