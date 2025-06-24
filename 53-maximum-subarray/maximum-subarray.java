class Solution {
    public int maxSubArray(int[] nums) {
        int m=nums[0];
        int s=0;
        for(int num:nums){
            s+=num;
            if(s>m){
                m=s;
            }
            if(s<0){
                s=0;
            }
        }
        return m;
    }
}