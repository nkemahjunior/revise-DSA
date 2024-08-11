public class InsertInSortedList {

    private static ListNode head;
    private  static ListNode second;
    private  static ListNode third;
    private  static ListNode fourth;

   public static  void  insertInSortedList(int data){

        if(head == null) return;

        ListNode node = new ListNode(data);

        ListNode current = head;
        ListNode previous = null;
        while(current.next != null && current.data < data ){
            previous = current;
            current = current.next;
        }


        node.next = current;
        previous.next = node;

    }


    public static void main(String[] args) {
        PrintLinkedListElements print = new PrintLinkedListElements();

        head = new ListNode(11);
        second = new ListNode(12);
        third = new ListNode(25);
        fourth = new ListNode(26);



        //connecting the nodes
        head.next = second; // 10 -> 1
        second.next = third; // // 10 -> 1 -> 8
        third.next = fourth; // // 10 -> 1 -> 8 -> 11 -> null

       insertInSortedList(16);

        print.printLinkedListElements(head);
    }
}
