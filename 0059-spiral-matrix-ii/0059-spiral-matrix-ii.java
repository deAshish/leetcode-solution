class Solution {
    public int[][] generateMatrix(int n) {
        int[][] requiredMatrix = new int[n][n];
        int left =0, right = n-1, top=0, bottom =n-1, number=1;
        while(left <= right && top <= bottom){
            // fill row from left to right;
            for(int i=left; i<= right; i++){
                requiredMatrix[top][i] = number++;
            }
            top++;
            
            // fill column from top to bottom
            for(int i=top; i<= bottom; i++){
                requiredMatrix[i][right]= number++;
            }
            right--;
            
            // fill row from right to left;
                for(int i=right; i>= left; i--){
                requiredMatrix[bottom][i]=number++;
            }
            bottom--;
            
            
            // fill column from bottom to top
               for(int i=bottom; i>= top; i--){
                requiredMatrix[i][left]=number++;
            }
            left++; 
            
        }
        return requiredMatrix;
    }
}