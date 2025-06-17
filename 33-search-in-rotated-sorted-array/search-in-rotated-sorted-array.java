class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int l=nums.length-1;
        while(s<=l){
            int mid=s+(l-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[s]<=nums[mid]){
                if(nums[s]<=target && nums[mid]>target){
                l=mid-1;
                }else{
                    s=mid+1;
                }
            }else{
                if(nums[l]>=target && nums[mid]<target){
                    s=mid+1;
                }else{
                    l=mid-1;
                }
            }
        }
        return -1;
    }
}