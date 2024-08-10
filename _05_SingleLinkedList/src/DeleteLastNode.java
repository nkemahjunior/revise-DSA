public class DeleteLastNode {

    private static ListNode head;
    private  static ListNode second;
    private  static ListNode third;
    private  static ListNode fourth;

    private static  ListNode deleteLastNode(){

        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }

        previous.next = null;
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

       ListNode deletedNode = deleteLastNode();
        print.printLinkedListElements(head);
        System.out.println("deleted node is " + deletedNode.data);
    }
}
