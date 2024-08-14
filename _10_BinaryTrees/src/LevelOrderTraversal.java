import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    /****
     * EXAMPLE
     *
     *      *                                         1
     *      *                                     /       \
     *      *                                   2           3
     *      *                                 /   \        /  \
     *      *                                4     5      6    7
     *
     *      the tree will be traverse in the form -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
     *
     *
     */

    protected  void levelOrder(BinaryTree.TreeNode root){

        Queue<BinaryTree.TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            BinaryTree.TreeNode temp = queue.poll();
            System.out.println(temp.data);

            if(temp.left != null){
                queue.offer(temp.left);
            }
            if(temp.right != null){
                queue.offer(temp.right);
            }
        }
    }
}
