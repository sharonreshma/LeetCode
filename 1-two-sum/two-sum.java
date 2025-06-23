class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int m=target-nums[i];
            if(h.containsKey(m)){
                return new int[]{h.get(m),i};
            }
            h.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}