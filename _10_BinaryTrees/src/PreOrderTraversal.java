import java.util.Stack;

public class PreOrderTraversal {

    /**
     * SOLUTION
     * visit the root node
     * Traverse the left subtree in pre order fashion
     * Traverse the right subtree in pre order fashion
     * IF leaf is null return to previous
     *
     * EXAMPLE
     *
     *                                         1
     *                                     /       \
     *                                   2           3
     *                                 /   \        /  \
     *                                4     5      6    7
     *
     *   Start at 1 .. do the solution steps (root = 1)
     *   go to 2 , do the solution steps (root = 2 now)
     *   go to 4 , do the solution steps (root = 4 now) no leaves for 4 return to previous back
     *   go to 5 , do the solution steps (root = 5 now) no leaves return back to 2 then to 1
     *   repeat solutions again
     *
     *   the tree will be processed in this order  : 1 -> 2 -> 4 -> 5 -> 3 -> 6 -> 7
     *   * **/

    protected void preOrderRecursive(BinaryTree.TreeNode root){
        // check the usage of this method in the BinaryTree class
        // check timestamp :  15 : 10 : 56  to see how the call stack will work for this recursive method
        // recursion uses a stack behind the scenes

        //base case
        if(root == null) return;

        System.out.println(root.data + " ");

        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    protected  void preOrderIterative(BinaryTree.TreeNode root){
        if( root == null) return;

        Stack<BinaryTree.TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            BinaryTree.TreeNode temp = stack.pop();
            System.out.println(temp.data);

            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }
}
