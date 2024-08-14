public class MaximumValueInBinaryTree {

    protected int maximumValue(BinaryTree.TreeNode root){

        //check timestamp at 18:14:28 to see how the function calls work

        //base case
        if(root == null) return  0000;

        int maximum = root.data;



       int left =  maximumValue(root.left);
       int right = maximumValue(root.right);

       if(left > maximum) maximum = left;
       if(right > maximum) maximum = right;


       return maximum;
    }
}
