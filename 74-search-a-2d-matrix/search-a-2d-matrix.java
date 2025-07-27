class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =0, column = matrix[0].length-1;
        while(row <= matrix.length-1 && column >= 0){
            if(matrix[row][column] == target) return true;
            else if(target >matrix[row][column]) row++;
            else column--;
        }
        return false;
    }
}