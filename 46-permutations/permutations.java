class Solution {
    public void solve(List<List<Integer>>res,int[] nums,List<Integer>curr){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(curr.contains(nums[i])) continue;
            curr.add(nums[i]);
            solve(res,nums,curr);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        solve(res,nums,new ArrayList<>());
        return res;

    }
}