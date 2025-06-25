class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>idx;i--){
            if(nums[i]>nums[idx]){
                int t=nums[i];
                nums[i]=nums[idx];
                nums[idx]=t;
                break;
            }
        }

         reverse(nums,idx+1,n-1);
    }
    public void reverse(int[] nums,int s,int e){
        while(s<e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s++;
            e--;
        }
    }
}