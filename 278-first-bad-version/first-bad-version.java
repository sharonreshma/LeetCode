/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s=0;
        int l=n;
        int b=0;
        while(s<=l){
            int mid=s+(l-s)/2;
            if(isBadVersion(mid)){
                b=mid;
                l=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return b;
    }
}