class Solution {
    public boolean boq(int[] bloomDay,int mid,int m,int k){
        int c=0;
        int b=0;
        for(int bloomDays:bloomDay){
         if(bloomDays<=mid){
              c++;
         }
         else{
            b+=c/k;
            c=0;
         }
        }
        b+=c/k;
        if(b>=m){
            return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<m*k){
            return -1;
        }
        int s=Integer.MAX_VALUE;
        int l=Integer.MIN_VALUE;
        
        for(int bloomDays:bloomDay){
                l=Math.max(bloomDays,l);
                s=Math.min(bloomDays,s);
            
        }
        int ans=-1;
        while(s<=l){
            int mid=s+(l-s)/2;
            if(boq(bloomDay,mid,m,k)==true){
                ans=mid;
                l=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }
}