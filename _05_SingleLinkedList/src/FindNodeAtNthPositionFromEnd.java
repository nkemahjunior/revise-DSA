public class FindNodeAtNthPositionFromEnd {

    private static ListNode head;
    private  static ListNode second;
    private  static ListNode third;
    private  static ListNode fourth;

    public static ListNode findNodeAtNthPositionFromEnd(int position){
        // solution is to use two pointers, where one of the pointers is going to ahead by n steps, n = position while the second pointer remains at the head
        //after we start moving both pointers simultaneously

        if(head == null) return  null;

        ListNode firstPointer = head;
        ListNode secondPointer = head;
        int count = 0;

        //move first pointer n positions
        while(count < position){
            firstPointer = firstPointer.next;
            count++;
        }

        while(firstPointer != null){
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

        return secondPointer;

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
        ListNode node = findNodeAtNthPositionFromEnd(2);
        print.printLinkedListElements(head);
        System.out.println("node is "+ node.data);
    }
}
