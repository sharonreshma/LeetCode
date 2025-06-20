class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rotates(nums,0,nums.length-1);
        rotates(nums,0,k-1);
        rotates(nums,k,nums.length-1);
    }
    public void rotates(int nums[],int s,int e){
        while(s<=e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s++;
            e--;
        }

    }
}