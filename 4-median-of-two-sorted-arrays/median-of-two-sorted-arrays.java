class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0, j=0,k=0;
        int[] arr=new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
         if(nums1[i]<nums2[j]){
            arr[k++]=nums1[i++];
         }else{
            arr[k++]=nums2[j++];
         }
        }
        while(i<nums1.length){
            arr[k++]=nums1[i++];
            
        }
        while(j<nums2.length){
            arr[k++]=nums2[j++];
        }
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2!=0){
            return (double)arr[n/2];
        }else{
            int mid1=arr[n/2-1];
            int mid2=arr[(n/2)];
            
        return ((double)mid1+(double)mid2)/2.0;
        }
    }
}