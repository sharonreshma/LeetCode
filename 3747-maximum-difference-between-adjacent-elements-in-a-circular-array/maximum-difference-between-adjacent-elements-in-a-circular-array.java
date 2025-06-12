class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=0;
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            ans=Math.abs(nums[i]-nums[i+1]);
            if(ans>max){
                max=ans;
            }
        }
        int l=Math.abs(nums[0]-nums[nums.length-1]);
        if(l>max){
            return l;
        }
        return max;
    }
}