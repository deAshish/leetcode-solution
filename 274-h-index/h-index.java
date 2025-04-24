class Solution {
    public int hIndex(int[] citations) {
        //using bucket counting
        int totalPaper =citations.length;
        int[] bucket = new int[totalPaper+1];

        for(int n: citations){

            if(n >= totalPaper){
                bucket[totalPaper]++;  
            } 
            else {
                bucket[n]++; 
                }
        }
        //now checking from higher to lower
        int total =0;
        for(int i= totalPaper; i>=0; i--){
            total +=bucket[i];
                
                if(total >=i){
                    return i;
                }
        }
        return 0;
    }
}