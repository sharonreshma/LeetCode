class Solution {
    public void rotate(int[][] matrix) {
         int[][] ans=new int[matrix.length][matrix[0].length];
         int index=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=matrix[i].length-1;j>=0;j--){
                ans[i][index]=matrix[j][i];
                index++;
            }
            index=0;
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                matrix[i][j]=ans[i][j];
            }
        }
    }
}