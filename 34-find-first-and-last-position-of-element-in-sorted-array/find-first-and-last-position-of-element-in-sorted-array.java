class Solution {
    public int search(int[] nums,int target,boolean index){
        int s=0;
        int l=nums.length-1;
        int ans=-1;
        while(s<=l){
            int mid=s+(l-s)/2;
            if(nums[mid]==target){
                ans=mid;
                if(index){
                    l=mid-1;
                }else{
                    s=mid+1;
                }
            }
            else if(nums[mid]<target){
                s=mid+1;
            }else{
                l=mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,1};
        int start=search(nums,target,true);
        int last=search(nums,target,false);
        ans[0]=start;
        ans[1]=last;
        return ans;
    }
}