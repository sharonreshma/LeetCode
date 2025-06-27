class Solution {
    public int subarraySum(int[] nums, int k) {
        int s=0;int c=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,1);
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            int rem=s-k;
            c+=h.getOrDefault(rem,0);
            h.put(s,h.getOrDefault(s,0)+1);
        }
        return c;
    }
}