class Solution {
    public int solve(int i,int n,int[] nums,int[] dp){
        if(n==1){
            return nums[0];
        }
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]=Math.max(solve(i+1,n,nums,dp),nums[i]+solve(i+2,n,nums,dp));
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int[] dp1=new int[n+1];
        Arrays.fill(dp1,-1);
        int[] dp2=new int[n+1];
        Arrays.fill(dp2,-1);
        return Math.max(solve(0,n-1,nums,dp1),solve(1,n,nums,dp2));
    }
}