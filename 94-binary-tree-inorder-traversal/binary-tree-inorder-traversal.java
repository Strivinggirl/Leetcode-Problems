/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void in(TreeNode root,List<Integer>ans){
       Stack<TreeNode>st=new Stack<>();
        while(true){
        if(root!=null){
            st.add(root);
            root=root.left;
        }
            else{
                if(st.isEmpty()){
                    break;
                }
                root=st.pop();
                ans.add(root.val);
                root=root.right;
                
            }
        }

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        in(root,ans);
        return ans;
    }
}