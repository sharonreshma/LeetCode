class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                
            }
        }
       
        for(int i=0;i<matrix.length;i++){
             int s=0,l=matrix.length-1;
            while(s<l){
                int t=matrix[i][s];
                matrix[i][s]=matrix[i][l];
                matrix[i][l]=t;
                s++;
                l--;
            }
        }
    }
}