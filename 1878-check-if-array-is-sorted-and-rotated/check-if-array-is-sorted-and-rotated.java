class Solution {
    public boolean check(int[] arr) {
     int c=0;
     for(int i=1;i<arr.length;i++){
        if(arr[i-1]>arr[i]){
            c++;
        }
       
     } 
      if(arr[arr.length-1]>arr[0]){
            c++;
        }
        if(c<=1){
            return true;
        } 
        return false;
    }
}