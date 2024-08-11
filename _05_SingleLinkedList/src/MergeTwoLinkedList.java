import java.lang.ref.PhantomReference;

public class MergeTwoLinkedList  {



    //first linked list fields
    private static ListNode headA;
    private  static ListNode secondA;
    private  static ListNode thirdA;
    private  static ListNode fourthA;

    //second linked list fields
    private static ListNode headB;
    private  static ListNode secondB;
    private  static ListNode thirdB;
    private  static ListNode fourthB;


    public static  void  merge(){


        ListNode current = headA;
        while (current.next != null){
            current = current.next;
        }

        current.next = headB;
        headB = null;


    }

    public static void main(String[] args) {
        PrintLinkedListElements print = new PrintLinkedListElements();

        headA = new ListNode(1);
        secondA = new ListNode(2);
        thirdA = new ListNode(3);
        fourthA = new ListNode(4);

        //connecting the nodes
        headA.next = secondA; // 1 -> 2
        secondA.next = thirdA; // // 1 -> 2 -> 3
        thirdA.next = fourthA; // // 1 -> 2 -> 3 -> 4 -> null


        headB = new ListNode(5);
        secondB = new ListNode(6);
        thirdB = new ListNode(7);
        fourthB = new ListNode(8);

        //connecting the nodes
        headB.next = secondB; // 5 -> 6
        secondB.next = thirdB; // // 5 -> 6 -> 7
        thirdB.next = fourthB; // // 5 -> 6 -> 7 -> 8 -> null

        merge();

        System.out.println(headA);
        System.out.println(headB);
        print.printLinkedListElements(headA);
       // print.printLinkedListElements(headB);

    }
}
