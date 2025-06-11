class Solution {
    public boolean boq(int[] bloomDay,int mid,int m,int k){
          int nb=0;
          int c=0;
          for(int arr:bloomDay){
            if(arr<=mid){
                c++;
            }
            else{
                nb+=c/k;
                c=0;
            }
            
          }
          nb+=c/k;
          if(nb>=m){
                return true;
            }
            return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int s=Integer.MAX_VALUE;
        int e=Integer.MIN_VALUE;
        for(int arr:bloomDay){
           e= Math.max(arr,e);
            s=Math.min(arr,s);
        }
        int ans=-1;
        if(bloomDay.length<m*k){
            return -1;
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(boq(bloomDay,mid,m,k)==true){
               ans=mid;
               e=mid-1;
            }else{
               s=mid+1;
            }
        }
        return ans;
    }
}