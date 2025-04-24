class Solution {
    public int hIndex(int[] citations) {
        //using in build sort function to sort array
        Arrays.sort(citations);
        int totalPaper = citations.length;
        int hIndex = 0;

        for(int i=0; i< totalPaper; i++){
            int paperIndex = totalPaper -i;
            if(citations[i] >= paperIndex){
                hIndex++;
            }

        }
        return hIndex;
    }
}