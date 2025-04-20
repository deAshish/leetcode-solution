class Solution {
    public int numRabbits(int[] answers) {
        //HashMap to store count number of rabbits
        HashMap<Integer, Integer> countRabbit = new HashMap<>();
        // store total number of rabbits
        int result = 0;
        for(int ans: answers){
            if(ans == 0){
                // If one rabbit alone
                result++;
            }
            else{
                countRabbit.put(ans, countRabbit.getOrDefault(ans, 0)+1);
                // If a group is filled.
                if(countRabbit.get(ans) == ans+1){
                    result += ans + 1;
                    countRabbit.remove(ans);
                }
            }
        }

            for(int key: countRabbit.keySet()){
                result +=key +1;
            }

            return result;       
    }
}