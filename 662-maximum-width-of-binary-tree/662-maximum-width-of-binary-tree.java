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
//Pair(Node,index)
    class Pair{
        TreeNode node;
        int idx;
        
        Pair(TreeNode _node, int _idx){
            node = _node;
            idx = _idx;
        }
    }
    

class Solution {

// Approach :
// Width of Tree, for a particular level
// Last Index of Node - first Index of Node of that level will give us the width
// And for getting the indexes, we can use :
// For i index of node, it's leftChild : 2 * i +1,   rightChild : 2 * i + 2
    
    public int widthOfBinaryTree(TreeNode root) {
     if(root == null) return 0;
        
        int ans = 0;
        
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,0));
        
        while(!queue.isEmpty()){
            int size = queue.size();
            int minIndex = queue.peek().idx;//first element in the queue is the leftMost node with minIndex of that level 
            int first = 0, last = 0;
            for(int i = 0; i < size ; i++){
                int curr_idx = queue.peek().idx-minIndex; //To make the idx starting from zero at every level to avoid overflow
                TreeNode node = queue.peek().node;
                queue.poll();
                
                if(i== 0) first = curr_idx;
                if(i == size - 1) last = curr_idx;
                if(node.left != null) queue.offer(new Pair(node.left, curr_idx * 2 + 1));
                if(node.right != null) queue.offer(new Pair(node.right, curr_idx * 2 + 2)); 
                
                //Let say index of root is 0
                // Left child index : 2 * 0 + 1
                // Right child index : 2 * 0 + 2
                
                // For i index 
                // Left Child Index : 2 * i + 1
                // RIght Child INdex : 2 * i + 2
            }
            ans = Math.max(ans, last - first + 1);
            
        }
        
     return ans;
    
    }
}