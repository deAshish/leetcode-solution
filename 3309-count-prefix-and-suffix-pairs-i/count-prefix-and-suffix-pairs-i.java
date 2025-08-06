class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count =0;

        for(int i=0; i< words.length-1; i++){
            int m = words[i].length();
            for(int j= i+1; j< words.length; j++){
                int n = words[j].length();
                if(m > n){
                    continue;
                } 
                else if(words[j].substring(0, m).equals(words[i]) && words[j].substring(n-m).equals(words[i])){
                        count++;
                } 
            }
        }

        return count;
        
    }
}