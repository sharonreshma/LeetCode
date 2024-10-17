class Solution {
    public int trap(int[] h) {
        int[] l=new int[h.length];
        int[] r=new int[h.length];
        int max=0;
        for(int i=0;i<h.length;i++){
            max=Math.max(h[i],max);
            l[i]=max;
        }
        max=0;
                for(int i=h.length-1;i>=0;i--){
            max=Math.max(h[i],max);
            r[i]=max;
        }
        int sum=0;
        for(int i=0;i<h.length;i++){
        sum+=Math.min(l[i],r[i])-h[i];
        }
        return sum;
    }
}