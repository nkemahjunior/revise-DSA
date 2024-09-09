import java.util.ArrayList;
import java.util.List;

public class ConvertSortedListToBinaryST {

    public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }


    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
    }


    public static TreeNode sortedListToBST(ListNode head) {

        List<Integer> list = new ArrayList<>();

        while (head != null){
            list.add(head.val);
            head = head.next;
        }


        return new TreeNode();
    }
                                                                       //start = 0, end = arr
    public TreeNode divideAndConquer(TreeNode root, List<Integer> arr, int start, int end){


        int middle = start + (end - start) / 2;
        int n = end  - start;

        if(n==0){
            return root = new TreeNode(arr.get(start));
        }


        Integer middleElement = arr.get( middle);
        root = new TreeNode(middleElement);

        divideAndConquer(root.left, arr, 0, middle - 1);
        divideAndConquer(root.right, arr, middle + 1, middle + 1);
        return new TreeNode();


    }




    public static void main(String[] args) {

        int[] arr = {-10,-3,0,5,9};


        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for(int i =1; i < arr.length; i++){
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        int n = (1/2);

        System.out.println(n);

        sortedListToBST(head);
    }
}
