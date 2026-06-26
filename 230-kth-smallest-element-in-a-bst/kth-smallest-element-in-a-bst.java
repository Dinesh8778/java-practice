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
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;
        //left 
        if(root.left!=null){
            int ls = kthSmallest(root.left,k);
            if(ls!=-1){
                return ls;
            }
        }
        //root
        if(count + 1 == k){
            return root.val;
        }
        count = count + 1;
        //right
        if(root.right!=null){
            int rs = kthSmallest(root.right,k);
            if(rs!=-1){
                return rs;
            }
        }
        return -1;
    }
}
