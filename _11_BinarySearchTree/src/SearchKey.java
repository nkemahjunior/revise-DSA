public class SearchKey {


    protected BinarySearchTree.TreeNode search( BinarySearchTree.TreeNode root , int key){

        //base case
        if( root == null || root.data == key) return  root;

        if( key > root.data){
            return search(root.right, key);
        }
        else{
           return search(root.left, key);
        }
    }
}
