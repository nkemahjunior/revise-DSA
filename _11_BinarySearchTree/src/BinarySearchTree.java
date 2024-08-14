public class BinarySearchTree {

    protected TreeNode root;
    protected final InsertBinarySearchTree ins;

    public BinarySearchTree(InsertBinarySearchTree ins) {
        this.ins = ins;
    }

    protected static class TreeNode{
        protected int data;
        protected TreeNode left;
        protected TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    protected void insert(int value){
        root = ins.insert(root, value);
    }

    protected void inOrder(){
        inOrder(root);
    }

    protected void inOrder(TreeNode root){
        if(root == null) return;

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(new InsertBinarySearchTree());
        SearchKey sk = new SearchKey();
        ValidBinarySearchTree vbs = new ValidBinarySearchTree();


        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);

        //bst.inOrder();
       // BinarySearchTree.TreeNode ans = sk.search(bst.root,7);
        boolean ans = vbs.isValid(bst.root, Long.MIN_VALUE,Long.MAX_VALUE);

        System.out.println(ans);

    }
}
