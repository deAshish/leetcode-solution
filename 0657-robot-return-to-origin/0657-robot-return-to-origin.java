class Solution {
    public boolean judgeCircle(String moves) {
        int[] position = {0,0};
        
        for(int i=0; i< moves.length();i++){
            if(moves.charAt(i)=='U')
                position[1] = position[1] + 1;
            else if(moves.charAt(i)=='D')
                position[1] = position[1]-1;
            else if(moves.charAt(i)=='R')
                position[0] = position[0]+1;
            else
                position[0] = position[0]-1;
        }
        return position[0]==0 && position[1] == 0;
        
    }
}