import java.util.Stack;

public class InOrderTraversal {
    /**
     * In order Binary Tree traversal, FOLLOW this steps for each node
     * - Traverse the left subtree in order fashion
     * - visit the root node
     * - Traverse the right subtree in in order fashion
     *
     * EXAMPLE : given this tree
     *
     *      *                                         1
     *      *                                     /       \
     *      *                                   2           3
     *      *                                 /   \        /  \
     *      *                                4     5      6    7
     *
     *
     *      - start at 1, but don't process it
     *      - go to 2, but don't process it
     *      - go to 4, but don't process it
     *      - go to left subtree of 4
     *      - 4 does not have any left node, so go back to 4 and process it
     *      - go to the right subtree of 4, 4 does not have any right subtree, so go back to 4
     *      - go back to node 2.. since we have finished with the left tree of node 2 , we can process it
     *      - go to the right subtree of , which is node 5
     *      - keep repeating the steps
     *      - here is the order in which the nodes will be processed : 4 -> 2 -> 5 -> 1 -> 6 -> 3 -> 7
     *      -
     * **/

    protected void inOrderRecursive(BinaryTree.TreeNode root){
        //base case
        if( root == null) return;

        inOrderRecursive(root.left);
        System.out.println(root.data);
        inOrderRecursive(root.right);
    }

    protected void inOrderIterative (BinaryTree.TreeNode  root){

        Stack<BinaryTree.TreeNode> stack = new Stack<>();
        BinaryTree.TreeNode temp = root;

        while( !stack.isEmpty() || temp != null){

            if( temp != null){
                stack.push(temp);
                temp = temp.left;
            }else{
                temp = stack.pop();
                System.out.println(temp.data);
                temp = temp.right;
            }
        }
    }
}
