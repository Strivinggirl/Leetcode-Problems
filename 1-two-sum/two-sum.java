class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force approach 
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
           int x=nums[i];
            for(int j=i+1;j<nums.length;j++){
              if(x+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
              }
            }
        }
        return ans;
    }
}