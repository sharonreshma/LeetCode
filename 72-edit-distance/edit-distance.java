class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[][] dp=new int[n+1][m+1];
        for(int[] t:dp){
            Arrays.fill(t,-1);
        }
        return md(word1,word2,n,m,dp);
    }
    public int md(String word1, String word2,int n,int m,int[][] dp){
       if(n==0){
        return m;
       }
       if(m==0){
        return n;
       }
       if(dp[n][m]!=-1){
        return dp[n][m];
       }
      char c1=word1.charAt(n-1);
      char c2=word2.charAt(m-1);
      if(c1==c2){
        return dp[n][m]=(md(word1,word2,n-1,m-1,dp));
      }else{
        int del=md(word1,word2,n-1,m,dp);
        int rep=md(word1,word2,n-1,m-1,dp);
        int ins=md(word1,word2,n,m-1,dp);
        return dp[n][m]=1+(Math.min(del,Math.min(rep,ins)));
      }
    
    }
}