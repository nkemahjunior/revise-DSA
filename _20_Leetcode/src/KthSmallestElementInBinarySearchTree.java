/**
 * Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
 *
 *   EXAMPLE
 *   Input: root = [5,3,6,2,4,null,null,1], k = 3
 *   Output: 3
 *   Explanation: Since this is a binary search tree, it means traversing this tree in an order fashion, the elements would already be sorted
 *   INorder traversal = left -> root -> right
 *   inorder traversal of this tree = 1,2,3,4,5,6
 *
 *   k = 3 = 3th smallest element = 3
 *
 *                                                              5
 *                                                           /     \
 *                                                        3          6
 *                                                      /   \      /   \
 *                                                     2      4
 *                                                    /
 *                                                   1
 *
 *
 *   EXAMPLE 2
 *    k = 3
 *
 *   INorder traversal = left -> root -> right
 *   inorder traversal of this tree = 4,8,10,12,14,20,22
 *
 *   k = 3 = 3th smallest element = 10
 *   if k = 5, 5th smallest element = 14
 *
 *                                                              20
 *                                                           /     \
 *                                                        8          22
 *                                                      /   \      /   \
 *                                                     4     12
 *                                                         /   \
 *                                                       10      14
 *
 */
public class KthSmallestElementInBinarySearchTree {

    public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
    }
    static  int totalCount = 0;

    public static int kthSmallest(TreeNode root, int k) {

        if(root == null ) return totalCount;

        int val = kthSmallest(root.left, k);
        if(totalCount == k) {
            return val;
        }

        totalCount++;
        System.out.println("node ="+root.val + " totalCount ="+totalCount );

        if(totalCount == k) {
            return root.val;
        }
        kthSmallest(root.right, k);

         return 100;
    }

    public static void main(String[] args) {
        // Creating leaf nodes first
        TreeNode node1 = new TreeNode(1);

        // Creating intermediate nodes
        TreeNode node2 = new TreeNode(2, node1, null); // node 1 is the left child, no right child
        TreeNode node4 = new TreeNode(4); // no children

        // Creating the next level
        TreeNode node3 = new TreeNode(3, node2, node4); // node 2 as left child, node 4 as right child
        TreeNode node6 = new TreeNode(6); // no children

    // Finally, creating the root
        TreeNode root = new TreeNode(5, node3, node6); // node 3 as left child, node 6 as right child

        System.out.println(kthSmallest(root, 3));

    }
}
