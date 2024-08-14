public class PostOrderTraversal {
    /***
     * Apply this steps to each node of the binary tree
     *
     * Traverse the left subtree in post order fashion
     * Traverse the right subtree in post order fashion
     * Visit the node
     *
     * Example
     *
     *      *      *                                         1
     *      *      *                                     /       \
     *      *      *                                   2           3
     *      *      *                                 /   \        /  \
     *      *      *                                4     5
     *
     *  this is how we will traverse the tree -> 4 -> 5 -> 2 -> 3 -> 1
     * **/

    protected void postOrderRecursive(BinaryTree.TreeNode root){
        // check timestamp 14:46:51 to see how the method call for this function works incase you have forgotten my boy

        //base case
        if(root == null ) return;

        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.println(root.data);
    }
}
