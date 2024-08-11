public class InsertAtAnyPosition {

    private static ListNode head;
    private  static ListNode second;
    private  static ListNode third;
    private  static ListNode fourth;

    public static  void insertAtAnyPosition(int value, int position){

        ListNode node = new ListNode(value);

        //check if head is null
        if(position == 1){
            node.next = head;
            head = node;
            return;
        }

        ListNode current = head;
        int curPosition = 1;

        while(current.next != null){

            if (curPosition == position) break;
            current = current.next;
            curPosition++;
        }

        node.next = current.next;
        current.next = node;

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


       // insertAtAnyPosition(100,1);
        insertAtAnyPosition(200,2);
        print.printLinkedListElements(head);
    }
}
