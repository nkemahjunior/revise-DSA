
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

        /**
         * solution: create a new dummy list and add the nodes from the two list we want to merge in order
         * */


        ListNode dummy = new ListNode(0);

        ListNode current1 = headA;
        ListNode current2 = headB; // remember in java , objects are assigned by reference.. so anything you do on current 2 will affect headB also..
        //co current 2 and headB point to thesame object in memory..
        ListNode newList = dummy; // newList is acts as a reference to dummy, any change on newList is a change to Dummy



        while(current1 != null && current2 != null){
            if(current1.data <= current2.data){
                newList.next = current1; // remember object reference.. so changes on newList will still affect headA, since it is pointing to current1 and current1 = headA
                current1 = current1.next;

            }else{
                newList.next = current2;
                current2 = current2.next;
            }
                newList = newList.next;
        }

        //current 1 becomes null if all the numbers in list 1 were smaller than those in list 2...
        // current 1 becomes null because  the current1 pointer keeps traversing alone untill it becomes null,
        // then the while loop will stop, so we just attach list 2 to our new list OR viceVersa
        //remember both list 1 and list 2 need to be sorted lists
        if(current1 == null){

            newList.next = current2;

        }else {

            newList.next = current1;

        }

        System.out.println(dummy); // you can return dummy.next so we will remove the first dummy node
    }

    public static void main(String[] args) {
        PrintLinkedListElements print = new PrintLinkedListElements();

        headA = new ListNode(1);
        secondA = new ListNode(2);
        thirdA = new ListNode(20);
        fourthA = new ListNode(90);

        //connecting the nodes
        headA.next = secondA; // 1 -> 2
        secondA.next = thirdA; // // 1 -> 2 -> 3
        thirdA.next = fourthA; // // 1 -> 2 -> 3 -> 4 -> null


        headB = new ListNode(5);
        secondB = new ListNode(6);
        thirdB = new ListNode(40);
        fourthB = new ListNode(89);

        //connecting the nodes
        headB.next = secondB; // 5 -> 6
        secondB.next = thirdB; // // 5 -> 6 -> 7
        thirdB.next = fourthB; // // 5 -> 6 -> 7 -> 8 -> null

        merge();


/*        System.out.println(headA);
        System.out.println(headB);*/
        /*print.printLinkedListElements(headA);
        /*print.printLinkedListElements(headB);*/

    }
}
