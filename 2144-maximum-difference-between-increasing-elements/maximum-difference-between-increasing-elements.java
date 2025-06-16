class Solution {
    public int maximumDifference(int[] nums) {
        int d=0,max=-1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
               d=nums[j]-nums[i];
               if(d>max){
                max=d;
               }
                }
            }
        }
            return max;
    }
}