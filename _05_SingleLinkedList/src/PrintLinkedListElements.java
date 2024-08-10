public class PrintLinkedListElements {




   /* private static class ListNode{
        private  int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }*/

    public  void printLinkedListElements(ListNode head){

        ListNode current = head;
        while( current != null){
            System.out.println( current.data + "  ->  ");
            current = current.next;
        }
        System.out.println("null");
    }



   /* public void insertNodeAtBeginning(int value){

        ListNode node = new ListNode(value);
        node.next = head;
        head = node;

    }*/

    public static void main(String[] args) {
        PrintLinkedListElements print = new PrintLinkedListElements();

        ListNode head;

        head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);


        //connecting the nodes
        head.next = second; // 10 -> 1
        second.next = third; // // 10 -> 1 -> 8
        third.next = fourth; // // 10 -> 1 -> 8 -> 11 -> null


        print.printLinkedListElements(head);

        //sil.insertNodeAtBeginning(55);
        //sil.lengthOfSingleLinkedList();

    }

   /* public static void main(String[] args) {
        SinglyLinkedList sil = new SinglyLinkedList();

        sil.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //connecting the nodes
        sil.head.next = second; // 10 -> 1
        second.next = third; // // 10 -> 1 -> 8
        third.next = fourth.next; // // 10 -> 1 -> 8 -> 11 -> null

        //sil.insertNodeAtBeginning(55);
        //sil.lengthOfSingleLinkedList();

    }*/
}
