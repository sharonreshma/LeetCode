class Solution {
    public int ship(int[] weights,int n){
        int d=1,load=0;
        for(int i=0;i<=weights.length-1;i++){
          if(weights[i]+load>n){
            d+=1;
            load=weights[i];
          }else{
            load+=weights[i];
          }
        }
        return d;
    }
    public int shipWithinDays(int[] weights, int days) {
        int s=0;
        int e=0;
        for(int weight:weights){
            s=Math.max(s,weight);
            e+=weight;
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(ship(weights,mid)<=days){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
}