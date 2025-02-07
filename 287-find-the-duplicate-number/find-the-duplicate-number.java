class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0;
        int fast=0;

        while(true){
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(fast==slow){
                break;
            }
        }
        slow=0;
       while(true){
        slow=nums[slow];
        fast=nums[fast];

        if(fast==slow){
            break;
        }
       }
       return slow;
    }
}