class Solution {
    public int differenceOfSums(int n, int m) {
        int s=0,d=0;
        for(int i=1;i<=n;i++){
         if(i%m!=0){
            s+=i;
         }else{
            d+=i;
         }
        }
        return s-d;
    }
}