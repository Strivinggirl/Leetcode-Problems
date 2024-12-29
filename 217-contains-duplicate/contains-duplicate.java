class Solution {
    public boolean containsDuplicate(int[] nums) {
        //4 approach
        //2 for loop,sort,hashmap,set

         HashMap<Integer,Integer>mp=new HashMap<>();

         for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
         }

          for(int i=0;i<nums.length;i++){
            if(mp.get(nums[i])>1) return true;
          }
          return false;
    }
}