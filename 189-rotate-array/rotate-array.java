class Solution {
    public void reverse(int s,int l,int[] nums){
        while(s<l){
            int temp=nums[s];
            nums[s]=nums[l];
            nums[l]=temp;
            s++;
            l--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);
    }

}