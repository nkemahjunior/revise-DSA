public class SearchElement {

    private static ListNode head;
    private  static ListNode second;
    private  static ListNode third;
    private  static ListNode fourth;

    private static  boolean  searchElement(int searchKey){



        ListNode current = head;
        while(current.next != null){

            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }

        return false;
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

        boolean found = searchElement(138);
        print.printLinkedListElements(head);
        System.out.println("is node found? " + found);

    }
}
