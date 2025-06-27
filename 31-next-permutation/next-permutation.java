class Solution {
    public void reverse(int[] nums,int s,int e){
        while(s<e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s++;
            e--;
        }
    }
    public void nextPermutation(int[] nums) {
        int idx=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
               idx=i;
               break;
            }
        }
        if(idx==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>=idx;i--){
            if(nums[i]>nums[idx]){
                int tt=nums[i];
                nums[i]=nums[idx];
                nums[idx]=tt;
                break;
            }
        }
reverse(nums,idx+1,nums.length-1);
    }
}