class Solution {
    public int findKthPositive(int[] arr, int k) {
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]-mid-1<k){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return s+k;
    }
}