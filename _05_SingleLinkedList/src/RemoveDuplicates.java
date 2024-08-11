public class RemoveDuplicates {
    private static ListNode head;
    private  static ListNode second;
    private  static ListNode third;
    private  static ListNode fourth;

    private  static void removeDuplicates(int date){
        // algorithm works only for a sorted list
        ListNode current = head;
        while ( current.next != null){

            if(current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
    }


    public static void main(String[] args) {
        PrintLinkedListElements print = new PrintLinkedListElements();

        head = new ListNode(11);
        second = new ListNode(13);
        third = new ListNode(13);
        fourth = new ListNode(12);



        //connecting the nodes
        head.next = second; // 10 -> 1
        second.next = third; // // 10 -> 1 -> 8
        third.next = fourth; // // 10 -> 1 -> 8 -> 11 -> null

        System.out.println(second);
        System.out.println(third);
        removeDuplicates(13);

         print.printLinkedListElements(head);
        System.out.println(head);
        System.out.println(second);
        System.out.println(third);

    }
}
