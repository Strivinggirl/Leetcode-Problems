class Solution {
    public int lcs(String s,String r){
         int n=s.length();
         int m=r.length();
         int dp[][]=new int[n+1][m+1];
         for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
               if(i==0||j==0){
                  dp[i][j]=0;
               }
                else if(s.charAt(i-1)==r.charAt(j-1)){
                  dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                  dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
         }
        return dp[n][m];
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder string=new StringBuilder(s);
        String r=string.reverse().toString();
        
        int ans=lcs(s, r );
        return ans;
    }
}