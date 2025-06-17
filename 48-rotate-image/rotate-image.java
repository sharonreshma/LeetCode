class Solution {
    public void rotate(int[][] matrix) {
        int t=0;
        int b=matrix.length-1;
        while(t<b){
        for(int i=0;i<matrix.length;i++){
            int temp=matrix[t][i];
            matrix[t][i]=matrix[b][i];
            matrix[b][i]=temp;
        }
            b--;
            t++;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
              matrix[j][i]=temp;
            }
        }

    }
}