class Solution {
    public boolean isHappy(int n) {
        Set<Integer> resultSet = new HashSet<>();
       
        while(n!=1 && !resultSet.contains(n)){
            resultSet.add(n);
            n = getSquareSum(n);
        }
        
        return n==1;
    }
 // Helper function to get square sum of n
     private int getSquareSum(int n){
         int sum = 0;
         while(n > 0){
            int digit  = n %10;
             sum += digit *digit;
             n /=10;
                
         }
         return sum;
    }
}