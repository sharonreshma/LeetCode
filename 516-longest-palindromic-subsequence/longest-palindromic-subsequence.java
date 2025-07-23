class Solution {
    public int longestPalindromeSubseq(String s) {
        int l=s.length();
        int[][] dp=new int[l+1][l+1];
        for(int[] t:dp){
            Arrays.fill(t,-1);
        }
        return fun(0,l-1,s,dp);
    }
    public int fun(int r,int l,String s,int[][] dp){
        if(r>l){
            return 0;
        }
        if(r==l){
            return dp[r][l]=1;
        }
        if(dp[r][l]!=-1){
   return dp[r][l];
        }
   char c1=s.charAt(r);
   char c2=s.charAt(l);
   if(c1==c2){
    return dp[r][l]=2+fun(r+1,l-1,s,dp);
   }else{
    int c=fun(r,l-1,s,dp);
    int cc=fun(r+1,l,s,dp);
    return dp[r][l]=Math.max(c,cc);
   }
    }
}