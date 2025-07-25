class Solution {
    public int maxSum(int[] nums) {
     int k=0;
        int m=0;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int t:s){
            if(t>0){
           k+=t;
            }
        }
        if(k==0){
            k=Collections.max(s);
        }
        return k;
    }
}