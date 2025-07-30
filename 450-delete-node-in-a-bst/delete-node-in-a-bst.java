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
class Solution{
    // Function to delete a node from BST.
    public static TreeNode deleteNode(TreeNode root, int val) {
        // code here.
        if(root==null) return null;
        if(val<root.val){
            root.left=deleteNode(root.left,val);
        }else if(val>root.val){
            root.right=deleteNode(root.right,val);
        }else{
            if(root.left==null && root.right==null){
                return null;
            }else if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                TreeNode successor=findMin(root.right);
                root.val=successor.val;
                root.right=deleteNode(root.right,successor.val);
            }
        }
        return root;
    }
    private static TreeNode findMin(TreeNode root){
        while(root.left !=null){
            root=root.left;
        }
        return root;
    }
}