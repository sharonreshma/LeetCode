class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int t=0;
        int l=0;
        int b=n-1, r=n-1;
        int c=1;
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){
                arr[t][i]=c++;
            }
            t++;
            for(int i=t;i<=b;i++){
                arr[i][r]=c++;
            }
            r--;
            if(l<=r){
                for(int i=r;i>=l;i--){
                    arr[b][i]=c++;
                }
                b--;
                for(int i=b;i>=t;i--){
                    arr[i][l]=c++;
                }
                l++;
            }
        }
        return arr;
    }
}