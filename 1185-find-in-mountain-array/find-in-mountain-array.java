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
        int p=peak(target,mountainArr);
        int f=search(target,mountainArr,0,p);
        if(f!=-1){
            return f;
        }
        return search(target,mountainArr,p+1,mountainArr.length()-1);
    }
   
    public int peak(int target,MountainArray mountainArr){
        int s=0;
        int e=mountainArr.length()-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                e=mid;
            }else{
                s=mid+1;
            }
        }
        return e;
    }
     public int search(int target,MountainArray mountainArr,int s,int e){
        boolean isasc= mountainArr.get(s)< mountainArr.get(e);

        while(s<=e){
            int mid=s+(e-s)/2;
             
            if(target==mountainArr.get(mid)){
                return mid;
            }
           
            if(isasc){
            if(mountainArr.get(mid)<target){
               s=mid+1;
                }else{
                e=mid-1;
            }
            }else{
                if(mountainArr.get(mid)<target){
               e=mid-1;
                }else{
                s=mid+1;
            }
            }
        }
        return -1;
    }
}