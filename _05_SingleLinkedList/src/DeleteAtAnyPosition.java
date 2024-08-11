public class DeleteAtAnyPosition {

    private static ListNode head;
    private  static ListNode second;
    private  static ListNode third;
    private  static ListNode fourth;

    public static  ListNode deleteAtAnyPosition(int position){


        if(head == null || head.next == null){
            return head;
        }



        if(position == 1){
            ListNode deletedNode = head;
            ListNode temp = head.next;
            head.next = null;
            head = temp;

            return deletedNode;
        }

        int curPosition = 1;
        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {

            if(curPosition == position) break;

            previous = current;
            current = current.next;
            curPosition++;
        }

        previous.next = current.next;
        current.next = null;
        return  current;


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

        ListNode deletedNode = deleteAtAnyPosition(2);
        print.printLinkedListElements(head);
        System.out.println("deleted node is " + deletedNode);
        System.out.println(head);
    }
}
