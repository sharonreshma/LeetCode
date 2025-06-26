class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> r=new HashSet<>();
        Set<Integer> c=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    r.add(i);
                    c.add(j);
                }
            }
        }
        for(int rr:r){
        for(int j=0;j<matrix[0].length;j++){
            matrix[rr][j]=0;
        }
        }
        for(int cc:c){
        for(int i=0;i<=matrix.length-1;i++){
            matrix[i][cc]=0;
        }
        }

    }
}