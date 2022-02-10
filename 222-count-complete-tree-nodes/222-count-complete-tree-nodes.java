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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left = leftHeight(root);
        int right = rightHeight(root);
        
        return countNodes(root.left)+countNodes(root.right)+1;
        
    }
    public int leftHeight(TreeNode root){
        int count = 0;
        while(root.left!=null){
            count++;
            root=root.left;
        }
        return count;
    }
    public int rightHeight(TreeNode root){
        int count = 0;
        while(root.right!=null){
            count++;
            root=root.right;
        }
        return count;
    }
}