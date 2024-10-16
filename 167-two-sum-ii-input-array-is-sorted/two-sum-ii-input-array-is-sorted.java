class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s=0;
        int l=nums.length-1;
        while(nums[s]+nums[l]!=target){
            if(nums[s]+nums[l]<target){
                s++;
            }
            else{
                l--;
            }
        }
        return new int[]{s+1,l+1};
    }
}