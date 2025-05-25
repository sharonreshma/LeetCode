class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        int e=0;
        int d=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
            d=nums[i]%10;
            c++;
            nums[i]=nums[i]/10;
            }
            if(c%2==0){
                e++;
            }else{
                c=0;
            }
        }
        return e;
    }
}