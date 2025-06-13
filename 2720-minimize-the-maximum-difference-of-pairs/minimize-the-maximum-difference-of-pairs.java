class Solution {
    public int minimizeMax(int[] nums, int p) {
        if(p==0){
            return 0;
        }
        Arrays.sort(nums);
        int s=0;
        int e=nums[nums.length-1]-nums[0];
        while(s<e){
            int mid=s+(e-s)/2;
            int pairs=0;
            for(int i=1;i<nums.length;i++){
               if(nums[i]-nums[i-1] <=mid){
                     pairs++;
                     i++;
               }
            }
            if(pairs>=p){
                e=mid;
            }
            else{
                s=mid+1;
            }
        }
        return s;
    }
}