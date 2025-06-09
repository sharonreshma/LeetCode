class Solution {
    public long ban(int[] piles,int h){
        int tothours=0;
        for(int pile:piles){
            tothours+=(double)(pile+h-1)/(double)h;
        }
        return tothours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int e=0;
        for(int pile:piles){
            e=Math.max(pile,e);
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