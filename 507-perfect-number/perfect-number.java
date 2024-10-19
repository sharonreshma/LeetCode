class Solution {
    public boolean checkPerfectNumber(int n) {
       int s=0;
       for(int i=1;i<n;i++){
        if(n%i==0){
            s+=i;
        }
       }
       if(s==n){
        return true;
       }
      
        return false;
       
    }
}