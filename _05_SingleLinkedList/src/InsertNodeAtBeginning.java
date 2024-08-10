public class InsertNodeAtBeginning {

    private static ListNode head;


    public static void insertAtBeginning(int value){

        ListNode newNode = new ListNode(value);
        newNode.next =  head;
        head = newNode;

    }


    public static void main(String[] args) {

        PrintLinkedListElements print = new PrintLinkedListElements();


        head = new ListNode(11);
        ListNode second = new ListNode(12);
        ListNode third = new ListNode(13);
        ListNode fourth = new ListNode(14);


        //connecting the nodes
        head.next = second; // 10 -> 1
        second.next = third; // // 10 -> 1 -> 8
        third.next = fourth; // // 10 -> 1 -> 8 -> 11 -> null

        insertAtBeginning(100);
        insertAtBeginning(200);
        print.printLinkedListElements(head);


    }
}
