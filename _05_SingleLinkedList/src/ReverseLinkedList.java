public class ReverseLinkedList {

    private static ListNode head;
    private  static ListNode second;
    private  static ListNode third;
    private  static ListNode fourth;

    public static  ListNode reverseLinkedList(){

        if(head == null){
            return head;
        }



        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while(current != null){

            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }

        return  previous;
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

      //  ListNode newHead = reverseLinkedList();

       // print.printLinkedListElements(newHead);
        reverseLinkedList();
        print.printLinkedListElements(fourth);

    }
}
