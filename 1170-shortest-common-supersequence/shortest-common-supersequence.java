class Solution {
    
    public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
           for(int j=0;j<=m;j++){
            if(i==0 ||j==0){
             dp[i][j]=0;
            }
               else if(str1.charAt(i-1)==str2.charAt(j-1)){
                dp[i][j]=1+dp[i-1][j-1];
             }
               else{
                  dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
               }
           }
       }
        
     int i=n;
     int j=m;
     String str="";
     while(i>0 && j>0){
             if(str1.charAt(i-1)==str2.charAt(j-1)){
                 str=str+str1.charAt(i-1);
                 i--;
                 j--;
             }
             else if(dp[i-1][j]>=dp[i][j-1]){
               str= str+str1.charAt(i-1);
                 i--;
             }
             else if(dp[i][j-1]>dp[i-1][j]){
               str=str+str2.charAt(j-1);
                j--;
             }
     }
    while(i>0){
         str=str+str1.charAt(i-1);
         i--;
    }
        while(j>0){
            str=str+str2.charAt(j-1);
            j--;
        }
        
       StringBuilder reversed = new StringBuilder(str);
        return  reversed.reverse().toString();
    }
}
