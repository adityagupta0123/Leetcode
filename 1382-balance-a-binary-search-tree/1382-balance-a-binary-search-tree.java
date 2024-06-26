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
    public TreeNode balanceBST(TreeNode root) {
        if(root == null) return null;
        
        List<Integer> inorder = new ArrayList<>();
        
        traversein(root, inorder);
        return buildBalancedBST(inorder, 0, inorder.size() - 1);
        
    }
    public void traversein(TreeNode root,  List<Integer> inorder){
        if(root == null ) return ;
        
        traversein(root.left, inorder);
        inorder.add(root.val);
        traversein(root.right, inorder);
        
    }
     private TreeNode buildBalancedBST(List<Integer> elements, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(elements.get(mid));
        node.left = buildBalancedBST(elements, start, mid - 1);
        node.right = buildBalancedBST(elements, mid + 1, end);
        return node;
    }
}



