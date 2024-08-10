public class DeleteFirstNode {

    private static ListNode head;
    private  static ListNode second;
    private  static ListNode third;
    private  static ListNode fourth;


    public static ListNode deleteNodeAtFirstPosition(){

        if(head == null){
            return null;
        }



        ListNode temp = head.next;
        ListNode deletedNode = head;
        head.next = null; // break the link
        head = temp;

        return  deletedNode;

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

        ListNode deletedNode = deleteNodeAtFirstPosition();
        print.printLinkedListElements(head);
        System.out.println("deleted node is " + deletedNode.data);
    }
}
