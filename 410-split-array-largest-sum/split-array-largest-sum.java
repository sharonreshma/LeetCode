class Solution {
    public int splitArray(int[] nums, int k) {
        int s=0;
        int e=0;
        for(int i=0;i<nums.length;i++){
            s=Math.max(s,nums[i]);
            e+=nums[i];
        }
        while(s<e){
            int mid=s+(e-s)/2;
            int c=1;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                if(sum+nums[i]>mid){
                    sum=nums[i];
                    c++;
                } else{
                    sum=sum+nums[i];
                }
            }
            if(c>k){
                s=mid+1;
            }else{
                e=mid;
            }
        }
        return e;
    }
}