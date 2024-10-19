class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int s=i+1;
            int l=nums.length-1;
            while(s<l){
                int sum=nums[i]+nums[s]+nums[l];
                if(sum==0){
                    res.add(Arrays.asList(nums[i], nums[s], nums[l]));
                      while(s<l && nums[s]==nums[s+1]){
                        s++;
                      }
                      while(s<l && nums[l]==nums[l-1]){
                        l--;
                      }
                      s++;
                    l--;
                }
                
                else if(sum<0){
                    s++;
                }
                else{
                    l--;
                }
            }
        }
        return res;
    }
}