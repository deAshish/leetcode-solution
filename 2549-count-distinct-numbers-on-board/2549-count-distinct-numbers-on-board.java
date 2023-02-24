class Solution {
    public int distinctIntegers(int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(n,1);
        int days= 2;
        int boardNumber = n;
        while(days <= n){
            for(int i=1; i<boardNumber;i++){
                if(boardNumber % i == 1 )
                    hm.put(days, 1);
            }
            boardNumber--;
            days++;
        }
        return hm.size();
    }
}