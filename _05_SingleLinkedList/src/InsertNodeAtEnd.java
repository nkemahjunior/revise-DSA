public class InsertNodeAtEnd {

    private static ListNode head;
    private  static ListNode second;
    private  static ListNode third;
    private  static ListNode fourth;


    private  static  void insertAtEnd(int value){

        ListNode newNode = new ListNode(value);

        if( head == null){
            head = newNode;
            return;
        }

        ListNode current = head;
        while ( current.next != null){
            current = current.next;
        }
        current.next = newNode;

    }


    public static void main(String[] args) {
        PrintLinkedListElements print = new PrintLinkedListElements();


        head = new ListNode(11);
        second = new ListNode(12);
        third = new ListNode(13);
        fourth = new ListNode(14);


        //connecting the nodes
        head.next = second; // 10 -> 1
        second.next = third; // // 10 -> 1 -> 8
        third.next = fourth; // // 10 -> 1 -> 8 -> 11 -> null

        insertAtEnd(100);
        insertAtEnd(200);
        print.printLinkedListElements(head);
    }
}
