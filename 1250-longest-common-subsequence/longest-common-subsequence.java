class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
       int n=text1.length(),m=text2.length();
       int[][] dp=new int[n+1][m+1];
       for(int t[]:dp){
        Arrays.fill(t,-1);
       } 
       return lcs(text1,text2,n,m,dp);
    }
    public static int lcs(String text1,String text2,int n,int m,int[][] dp){
        if(n==0 ||m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        char ch1=text1.charAt(n-1);
        char ch2=text2.charAt(m-1);
        if(ch1==ch2){
        return dp[n][m]=(1+lcs(text1,text2,n-1,m-1,dp));
        }else{
 int c1=lcs(text1,text2,n,m-1,dp);
 int c2=lcs(text1,text2,n-1,m,dp);     
return dp[n][m]=Math.max(c1,c2);
   }
    }
}