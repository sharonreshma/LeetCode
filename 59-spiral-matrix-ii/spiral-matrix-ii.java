class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int t=0,b=n-1,l=0,r=n-1;
        int c=1;
        while(t<=b && l<=r){
            for(int i=l;i<=b;i++){
                arr[t][i]=c++;
            }
            t++;
            for(int i=t;i<=b;i++){
                arr[i][r]=c++;
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    arr[b][i]=c++;
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    arr[i][l]=c++;
                }
                l++;
            }
        }
        return arr;
    }
}