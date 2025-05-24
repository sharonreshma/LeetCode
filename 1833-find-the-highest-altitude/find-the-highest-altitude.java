class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        arr[0]=0;
        int j=1;
        int s=0;
        for(int i=0;i<gain.length;i++){
          s=gain[i]+arr[i];
          arr[j]=s;
          j++;
        }
        int m=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;
    }
}