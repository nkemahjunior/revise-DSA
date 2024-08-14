public class InsertBinarySearchTree {

    protected BinarySearchTree.TreeNode insert(BinarySearchTree.TreeNode root, int value){
        //check timestamp 19:03:01 to see how the recursive calls will work in case you've forgotten

        //base case
        if(root == null ){
            root = new BinarySearchTree.TreeNode(value);
            return root;
        }

        if( value < root.data){
            root.left = insert(root.left, value);
        } else{
            root.right = insert(root.right, value);
        }

        return root;
    }
}
