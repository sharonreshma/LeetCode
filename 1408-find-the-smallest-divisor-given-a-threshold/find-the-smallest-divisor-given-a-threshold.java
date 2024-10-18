class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int s=1;
        int l=1000000;
        while(s<=l){
            int mid=s+(l-s)/2;
            if(check(mid,nums)>threshold){
                s=mid+1;
            }
            else{
                l=mid-1;
            }
        }
        return s;
    }
        public int check(int mid,int nums[]){
            int res=0;
            for(int i=0;i<nums.length;i++){
                res+=(nums[i]+mid-1)/mid;
            }
          return res;
        }
}