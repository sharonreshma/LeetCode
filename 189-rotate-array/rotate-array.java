class Solution {
    public void reverse(int r,int l,int[] arr){
      while(l>=r){
        int temp=arr[r];
        arr[r]=arr[l];
        arr[l]=temp;
        r++;
        l--;
      }

    }
    public void rotate(int[] arr, int k) {
       int n=arr.length;
       k=k%n;
       reverse(0,n-1,arr);
       reverse(0,k-1,arr);
       reverse(k,n-1,arr);
       
    }
}