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
    static int total;
    public void solve(TreeNode root,int sum){
        if(root==null){
            return;
        }
        sum = sum*10+root.val;
        
        if(root.left==null && root.right==null){
            total = total+sum;
            return ;
        }
        
        solve(root.left,sum);
        solve(root.right,sum);
    }
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        total = 0;
        solve(root,0);
        
        return total;
    }
}