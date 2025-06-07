class Solution {
    public int findDuplicate(int[] nums) {
       HashSet<Integer> h=new HashSet<>();
       for(int num:nums){
        if(h.contains(num)){
            return num;
        }else{
            h.add(num);
        }
       }
       return -1;
    }
}