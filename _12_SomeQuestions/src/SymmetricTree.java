import java.util.Stack;

/**
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e. symmetric around it's center)
 *
 *                                           (1)
 *                                       /    |    \
 *                                    (2)     |     (2)
 *                                   /   \    |     /  \
 *                                (3)   (4)   |    (4)  (3)
 *                                            |
 *                                     line of symmetry
 *
 *                                     A symmetric binary tree
 *
 *                                           (1)
 *                                       /    |    \
 *                                    (2)     |     (2)
 *                                   /   \    |     /  \
 *                                (3)   (4)   |    (3)  (4)
 *                                            |
 *                                     line of symmetry
 *
 *                                     Non-symmetric binary tree
 *
 *
 *                                     (1)
 *                                     / \
 *                                     symmetric, because there's only one node, so it is obviously a mirror of itself
 */
public class SymmetricTree {

    protected static class TreeNode{
        protected TreeNode left;
        protected TreeNode right;
        protected int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    boolean isSymmetric(TreeNode root){
        if(root == null) return true;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while( !stack.empty()){
            TreeNode n1 = stack.pop();
            TreeNode n2 = stack.pop();

            // if the current left and right nodes are null, that means they are a mirror of themselves
            // skip the current iteration and go to the next iteration
            if(n1 == null && n2 == null) continue;

            if(n1 == null || n2 == null || n1.val != n2.val) return false;

            stack.push(n1.left);
            stack.push(n2.right);
            stack.push(n1.right);
            stack.push(n2.left);
        }

        return true;
    }
}
