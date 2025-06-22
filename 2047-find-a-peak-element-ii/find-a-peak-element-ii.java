class Solution {
    public int maxr(int[][] mat,int col){
        int m=0;
        int idx=0;
        for(int i=0;i<mat.length;i++){
        if(mat[i][col]>m){
            m=mat[i][col];
            idx=i;
        }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int s=0;
        int e=mat[0].length-1;
        while(s<=e){
            int mid=(s+e)/2;
            int row=maxr(mat,mid);
            int l=mid-1>0?mat[row][mid-1]:-1;
            int r=mid+1<mat[0].length?mat[row][mid+1]:-1;
            if(mat[row][mid]>l && mat[row][mid]>r){
                return new int[]{row,mid};
            }
            else if(mat[row][mid]<l){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}