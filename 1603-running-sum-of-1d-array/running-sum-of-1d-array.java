class Solution {
    public int[] runningSum(int[] nums) {
        int s=0;
        int[] arr=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            arr[j]=s;
            j++;
        }
        return arr;
    }
}