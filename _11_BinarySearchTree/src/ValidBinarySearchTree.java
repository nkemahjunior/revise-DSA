public class ValidBinarySearchTree {

    /**
     * TO solve this problem we are going to use a {min, max} attribute
     * here are the rules :
     *  1- if you go towards the left subtree , min remains same and max changes to parent value
     *  2- if you go towards right subtree, max remains same and min changes to parent value
     *  - at the top root take min = - infinity  and max = infinity
     *  EXAMPLE
     *                                            {-∞, ∞}
     *      *                                        6
     *      *                                   /              \
     *      *                        {-∞, 6} 4                   8 {6, ∞}
 *      *                                 /   \                 /  \
 *      *                        {-∞, 4} 2     8 {4, 6} {6, 8} 7    9 {8, ∞}
     *
      */




    protected boolean isValid(BinarySearchTree.TreeNode root, long min, long max){

        //check timestamp at 20:05:18 to see how the function calls wor

        //base case
        if(root == null ) return true;

        // MIN < root.data < MAX  ... a root should fall between the min and max for it to be valid
        if(root.data <= min || root.data >= max){
            return false;
        }

        //according to rule 1
        boolean left = isValid(root.left, min, root.data);
         // for each node, we checked if it's left subtree is valid, if valid then we check if the right subtree is valid
        if(left){
            //according to rule two
            boolean right = isValid(root, root.data, max);
            return right;
        }

        return false;

    }
}
