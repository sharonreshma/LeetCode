class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxw=-1,totw=0;
        for(int weight:weights){
            maxw=Math.max(maxw,weight);
            totw+=weight;
        }
        int s=maxw,e=totw;
        while(s<e){
            int mid=s+(e-s)/2;
            int sum=0;
            int c=1;
            for(int weight:weights){
                if(sum+weight>mid){
                    c++;
                    sum=0;
                }
                    sum+=weight;
                

            }
            if(c>days){
                s=mid+1;
            }else{
                e=mid;
            }
        }
        return s;
    }
}