class Solution {
    public boolean isPerfectSquare(int num) {
        long s=0;
        long l=num;
        while(s<=l){
            long mid=s+(l-s)/2;
            long sqr=mid*mid;
            if(sqr==num){
                return true;
            }
           else if(sqr<num){
                s=mid+1;
            }
            else if(sqr>num){
                l=mid-1;
            }

        }
        return false;
    }
}