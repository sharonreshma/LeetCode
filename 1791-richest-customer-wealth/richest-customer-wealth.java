class Solution {
    public int maximumWealth(int[][] accounts) {
        int s=0;
        int t=0;
        
        for(int i=0;i<accounts.length;i++){
         for(int j=0;j<accounts[i].length;j++){
            s+=accounts[i][j];
         }
         if(s>t){
            t=s;
         }
         s=0;
        }
        return t;
    }
}