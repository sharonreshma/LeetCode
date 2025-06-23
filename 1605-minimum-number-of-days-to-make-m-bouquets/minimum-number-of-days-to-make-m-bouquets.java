class Solution {
    public boolean boq(int[] bloomDay, int m, int k,int b){
        int c=0;
        int nob=0;
        for(int bb:bloomDay){
            if(bb<=b){
                c++;
            }
            else{
         nob+=c/k;
         c=0;
            }
        }
        nob+=c/k;
        if(nob>=m){
            return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int s=Integer.MAX_VALUE;
        int e=Integer.MIN_VALUE;
        if(bloomDay.length<m*k){
            return -1;
        }
        for(int b:bloomDay){
            s=Math.min(b,s);
            e=Math.max(b,e);
        }
          int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(boq(bloomDay,m,k,mid)==true){
                ans=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }
}