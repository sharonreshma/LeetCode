class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[nums.length];
        int c=0,k=0;
        int j=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
                c=0;
                for(j=0;j<n;j++){
                    if(nums[i]>nums[j]){
                        c++;
                    }
                }
                j=0;
                arr[i]=c;
        }
        return arr;
    }
}