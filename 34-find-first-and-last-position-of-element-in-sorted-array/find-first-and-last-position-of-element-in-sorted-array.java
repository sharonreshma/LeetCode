class Solution {
    public int lb(int[] nums,int target){
        int s=0;
        int e=nums.length-1;
        int ans=nums.length;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>=target){
                ans=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }
      public int ub(int[] nums,int target){
        int s=0;
        int e=nums.length-1;
        int an=nums.length;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>target){
                an=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return an;
    }
    public int[] searchRange(int[] nums, int target) {
        int l=lb(nums,target);
        if(l==nums.length || nums[l]!=target ){
            return new int[]{-1,-1};
        }
        return new int[]{l,ub(nums,target)-1};
    }
}