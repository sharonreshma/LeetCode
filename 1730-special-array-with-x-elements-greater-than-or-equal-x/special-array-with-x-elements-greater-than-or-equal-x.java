class Solution {
    public int specialArray(int[] nums) {
        int s=0;
        int e=1000;
        while(s<=e){
            int mid=s+(e-s)/2;
            int c=countNum(nums,mid);
            if(c==mid){
                return mid;
            }
            else if(c>mid){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
    public int countNum(int[] nums, int mid){
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=mid){
                c++;
            }
        }
        return c;
    }
}