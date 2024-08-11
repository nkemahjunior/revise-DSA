public class DeleteAKey {

    private static ListNode head;
    private  static ListNode second;
    private  static ListNode third;
    private  static ListNode fourth;


    public static void deleteAKey(int key){

        ListNode current = head;
        ListNode previous = null;






        while(current.next != null  && current.data != key){
            previous = current;
            current = current.next;
        }

        previous.next = current.next;
        current.next = null;
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

        deleteAKey(11);

        print.printLinkedListElements(head);

        System.out.println(head);
        System.out.println(third);
    }
}
