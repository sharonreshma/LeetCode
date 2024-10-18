class Solution {
    public int findKthPositive(int[] arr, int k) {
        int s=0;
        int l=arr.length-1;
        while(s<=l){
            int mid=s+(l-s)/2;
            int miss=arr[mid]-(mid+1);
            if(miss<k){
                s=mid+1;
            }else{
                l=mid-1;
            }
        }
        return k+l+1;
    }
}