class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // total gas left after cricuit completion
       int totalTank = 0; 
       //Gas in tank from the current start station
       int currentTank =0; 
       int startPosition =0;

       for(int i=0; i< gas.length; i++){
        int gain = gas[i] - cost[i];
        totalTank += gain;
        currentTank +=gain;
        // if curretn station has negative gas, try next station
        if(currentTank <0){
            startPosition = i+1;
            currentTank = 0;
        }

       }
       return totalTank >=0 ? startPosition : -1;
        
    }
}