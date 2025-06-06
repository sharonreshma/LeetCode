/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=peakIndexInMountainArray(mountainArr);
        int first=bs(target,mountainArr,0,peak);
        if(first!=-1){
            return first;
        }
        return bs(target,mountainArr,peak+1,mountainArr.length()-1);
    }
    public int peakIndexInMountainArray(MountainArray mountainArr) {
      int s=0;
      int l=mountainArr.length()-1;
      while(s<l){
        int mid=s+(l-s)/2;
        if(mountainArr.get(mid)>mountainArr.get(mid+1)){
            l=mid;
        }
        else{
            s=mid+1;
        }
      }
         return l;
    }
    public int bs(int target, MountainArray mountainArr,int s,int l) {
        boolean isAsc=mountainArr.get(s)<mountainArr.get(l);
        while(s<=l){
            int mid=s+(l-s)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            if(isAsc){
            if(mountainArr.get(mid)>target){
                l=mid-1;
            }
            else{
                s=mid+1;
            }
            }else{
               if(mountainArr.get(mid)>target){
                s=mid+1;
            }
            else{
                l=mid-1;
            } 
            }
            
        }
        return -1;
    }
}