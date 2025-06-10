class Solution {
    public long ban(int[] piles,int h){
   int tothr=0;
   for(int pile:piles){
    tothr+=(double)(pile+h-1)/(double)h;
   }
   return tothr;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int l=0;
        for(int pile:piles){
            if(pile>l){
                l=pile;
            }
        }
        while(s<=l){
            int mid=s+(l-s)/2;
            if(ban(piles,mid)<=h){
                l=mid-1;
            }else{
                s=mid+1;
            }
        }
        return s; 
    }
}