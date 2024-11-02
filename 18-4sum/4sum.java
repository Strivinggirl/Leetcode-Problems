class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
           for(int j=i+1;j<n-2;j++){
               if(j>i+1 && nums[j]==nums[j-1]) continue;
               long sum=(long)nums[i]+nums[j];
               int l=j+1;
               int r=n-1;
               while(l<r){
                   long currentSum=sum+nums[l]+nums[r];
                   if(currentSum==target){
                      ans.add(Arrays.asList(nums[i],nums[j],nums[l] , nums[r]));
                    while(l<r && nums[l]==nums[l+1])l++;
                    while(r>l && nums[r]==nums[r-1])r--;
                       l++;
                       r--;
                   }
                   else if(currentSum<target){
                     l++;
                   
                   }
                   else{
                       r--;
                   }

               }

           }
        }
        return ans;
    }
}