public class BinaryTree {

    private TreeNode root;

    protected static class TreeNode{
        protected TreeNode left;
        protected TreeNode right;
        protected int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree(){

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        PreOrderTraversal pr = new PreOrderTraversal();
        InOrderTraversal io = new InOrderTraversal();
        PostOrderTraversal po = new PostOrderTraversal();
        LevelOrderTraversal lo = new LevelOrderTraversal();
        MaximumValueInBinaryTree mv = new MaximumValueInBinaryTree();


        bt.createBinaryTree();
        //pr.preOrderRecursive(bt.root);
       // pr.preOrderIterative(bt.root);

        /*io.inOrderRecursive(bt.root);
        System.out.println("line break");
        io.inOrderRecursive(bt.root);*/

        //po.postOrderRecursive(bt.root);
        //lo.levelOrder(bt.root);
        int max = mv.maximumValue(bt.root);
        System.out.println(max);

    }
}
