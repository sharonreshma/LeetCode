class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0;
        int c=matrix[0].length-1;
        while(c>=0 &&r<matrix.length){
            if(matrix[r][c]==target){
                return true;
            }
            if(matrix[r][c]<target){
                r++;
            }else{
                c--;
            }

        }
        return false;
    }
}