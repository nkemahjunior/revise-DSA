public class LengthOfLinkedList {

    public static void lengthOfSingleLinkedList(ListNode head){

        ListNode current = head;
        int length = 0;

        while( current != null){
            length++;
            current = current.next;
        }

        System.out.println(length);
    }


    public static void main(String[] args) {

        ListNode head;

        head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);


        //connecting the nodes
        head.next = second; // 10 -> 1
        second.next = third; // // 10 -> 1 -> 8
        third.next = fourth; // // 10 -> 1 -> 8 -> 11 -> null

        lengthOfSingleLinkedList(head);
    }
}
