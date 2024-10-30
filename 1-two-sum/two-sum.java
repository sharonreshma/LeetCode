class Solution {
    public int[] twoSum(int[] nums, int target) {
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
        }
       } 
       return new int[]{};
    // int s=0;
    // int l=nums.length-1;
    // while(s<l){
    //     int sum=nums[s]+nums[l];
    //     if(sum==target){
    //         return new int[]{s,l};
    //     }
    //    else if(sum<target){
    //     s++;
    //    }
    //    else{
    //     l--;
    //    }
    // }
    // return new int[]{};
    }
}