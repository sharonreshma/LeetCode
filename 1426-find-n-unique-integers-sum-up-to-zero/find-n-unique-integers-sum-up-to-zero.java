class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        int l=0;
        int s=1;
         int r=n-1;
        if(n%2!=0){
        arr[0]=0;
        l=1;
        }else{
        l=0;
        }
        while(l<=r){
            arr[l]=s;
            arr[r]=-s;
            s++;
            l++;
            r--;
        }
return arr;
    }
}