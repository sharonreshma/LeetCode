class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] p=new int[nums.length];
        int[] n=new int[nums.length];
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
             if(nums[i]>=0){
                p[j]=nums[i];
                j++;
             }else{
                n[k]=nums[i];
                k++;
             }
        }
        int l=0,m=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr[i]=p[l];
                l++;
            }else{
                arr[i]=n[m];
                m++;
            }
        }
        return arr;
    }
}