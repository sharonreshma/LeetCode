class Solution {
    public long ban(int[] piles,int hr){
        int t=0;
        for(int pile:piles){
            t+=(double)(pile+hr-1)/(double)hr;
        }
        return t;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int e=0;
        for(int pile:piles){
            if(pile>e){
                e=pile;
            }
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(ban(piles,mid)<=h){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
}