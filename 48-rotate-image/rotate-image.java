class Solution {
    public void rotate(int[][] matrix) {
        int t=0;
        int b=matrix.length-1;
        while(t<b){
            for(int i=0;i<matrix.length;i++){
                //for(int j=0;j<matrix[0].length-1;i++){
                     int to=matrix[t][i];
                     matrix[t][i]=matrix[b][i];
                     matrix[b][i]=to;
                //}
            }
            t++;
            b--;
        }
         for(int i=0;i<matrix.length;i++){
                for(int j=i+1;j<matrix[0].length;j++){
                    int tt=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=tt;
                }
         }
    }
}