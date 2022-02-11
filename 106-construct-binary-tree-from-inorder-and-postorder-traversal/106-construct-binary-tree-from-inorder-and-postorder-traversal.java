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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || inorder.length!=postorder.length)
            return null;
        
        HashMap<Integer,Integer> inMap = new HashMap<Integer,Integer>();
        
        for(int i =0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        
        return buildTreeIn(inorder,0,inorder.length-1,postorder,0,postorder.length-1,inMap);
    }
        
        public TreeNode buildTreeIn(int[] inorder,int inStart,int inEnd,int[] postorder,int postStart,int postEnd,HashMap<Integer,Integer> inMap){
            if(inStart>inEnd || postStart>postEnd) return null;
            
            TreeNode root = new TreeNode(postorder[postEnd]);
            int inRoot = inMap.get(postorder[postEnd]);
            int numsLeft = inRoot-inStart;
            
            root.left = buildTreeIn(inorder,inStart,inRoot-1,postorder,postStart,postStart+numsLeft-1,inMap);
            root.right = buildTreeIn(inorder,inRoot+1,inEnd,postorder,postStart+numsLeft,postEnd-1,inMap);
            
            return root;
        }
}