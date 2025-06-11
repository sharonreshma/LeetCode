class Solution {
    public int arr(int[] nums,int mid){
        int s=1;
        int d=0;
        for(int i=0;i<=nums.length-1;i++){
        if(d+nums[i]<=mid){
            d+=nums[i];
        }else{
            s+=1;
            d=nums[i];
        }
        }
        return s;
    }
    public int splitArray(int[] nums, int k) {
        int s=0;
        int l=0;
        for(int num:nums){
            s=Math.max(s,num);
            l+=num;
        }
        while(s<=l){
   int mid=s+(l-s)/2;
   if(arr(nums,mid)<=k){
    l=mid-1;
   }else{
    s=mid+1;
   }
        }
        return s;
    }
}