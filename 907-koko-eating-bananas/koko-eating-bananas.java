class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //Using binary search to calculate minimum hr such that koko can eat all bananas within given hr.
        int n = piles.length;
        //Define start and end as 1 and max value in piles.
        int start=1, end = Arrays.stream(piles).max().orElse(0);

        while(start < end){
            int mid = start + (end -start)/2;
            int minHr = 0;

            //calculate minHr for the mid value
            for(int num: piles){
                minHr +=(num + mid -1)/mid;
                // if(minHr%mid != 0) minHr++;
            }

            // if minHr is less than or equal we assign new end as previous mid
            if(minHr <= h){
                end =mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
        
    }
}