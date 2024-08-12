import java.math.BigInteger;

public class AddTwoLinkedLists {

    //first linked list fields
    private static ListNode headA;
    private  static ListNode secondA;
    private  static ListNode thirdA;


    //second linked list fields
    private static ListNode headB;
    private  static ListNode secondB;
    private  static ListNode thirdB;
    private  static ListNode fourthB;
    private  static ListNode fifthB;
    private  static ListNode sixthB;
    private  static ListNode  seventhB;
    private  static ListNode eightB;
    private  static ListNode nineB;
    private  static ListNode tenB;


    //ineffiecient method
   /* public static ListNode addTwoNumbers(ListNode l1, ListNode l2){



        ListNode current1 = l1;
        ListNode current2 = l2;

        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        //get first number
        while(current1 != null){
           num1.append(current1.data);
            current1 = current1.next;
        }

        //get second number
        while(current2 != null){
            num2.append(current2.data);
            current2 = current2.next;

        }

        String num1R = String.valueOf(num1.reverse());
        String num2R = String.valueOf(num2.reverse());
        //int sum = Integer.parseInt(num1R ) + Integer.parseInt(num2R);

        //using BigInteger because leetcode's test cases where using extra large numbers
        BigInteger bigNum1 = new BigInteger(num1R);
        BigInteger bigNum2 = new BigInteger(num2R);

        BigInteger sum = bigNum1.add(bigNum2);



        int sumLength = String.valueOf(sum).length();
        String summ = String.valueOf(sum);


        ListNode answer = new ListNode(Integer.parseInt(String.valueOf(summ.charAt(0))));
        ListNode previous = null;
        ListNode current = answer;

       int count = 1;
        while(count < sumLength){
            // creating the list backwards
            previous = new ListNode(Integer.parseInt(String.valueOf(summ.charAt(count))));
            previous.next = current;
            current = previous;
            count++;
        }

      //  System.out.println(current);

        //System.out.println(summ.charAt(sumLength-1));


        return  current;
    }*/

    //https://leetcode.com/problems/add-two-numbers/description/
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        // dont bother trying to reverse the list as you did in the previous method, then adding the sum and creating the answer list backwards
        //the question description was confusing
        //if you add the list from the head going downward you will still get thesame answer, so need reversing(the two list)

        /**
         * solution we will use a dummy node and a carry value, since each node should store only a  single number
         * we will use some math properties too..
         * say our current sum is 14
         * sum / 10.. gives one whole number e.g 14 / 10 = 1 (remember this is integer division)
         *  sum % 10 gives the remaining number e.g 14 % 10 = 4
         *  joining the two, we get 14 back
         *
         *  our while loop runs so far as any of the list still have a value(data).. we do the following in the while loop :
         *   calculate the sum using carry + x + y
         *   calculate our new carry value using the sum from the previous step
         *   try adding some two numbers on paper e.g 1947 + 65... and you will understand this two previous steps
         *   then we traverse along the nodes of l1, l2 and dummy while repeating this previous steps
         * */

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;

        while(l1 != null || l2 != null){

            int x = l1 != null ? l1.data : 0;
            int y = l2 != null ? l2.data : 0;

            int sum = carry + x + y;
            carry = sum / 10;

            tail.next = new ListNode( sum % 10);

            tail = tail.next;

            if( l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if( carry > 0) tail.next = new ListNode(carry); // if an additional carry value was remaining

        //System.out.println(dummy);

        return dummy.next; // retruning .next because of that dummy first node(0)
    }

    public static void main(String[] args) {
        PrintLinkedListElements print = new PrintLinkedListElements();

        /***
         * [9]
         * l2 =
         * [1,9,9,9,9,9,9,9,9,9]
         * */

        headA = new ListNode(9);





        headB = new ListNode(1);
        secondB = new ListNode(9);
        thirdB = new ListNode(9);
        fourthB = new ListNode(9);
        fifthB = new ListNode(9);
        sixthB = new ListNode(9);
        seventhB = new ListNode(9);
        eightB = new ListNode(9);
        nineB = new ListNode(9);
        tenB = new ListNode(9);


        //connecting the nodes
        headB.next = secondB;
        secondB.next = thirdB;
        thirdB.next = fourthB;
        fourthB.next = fifthB;
        fifthB.next = sixthB;
        sixthB.next = seventhB;
        seventhB.next = eightB;
        eightB.next = nineB;
        nineB.next = tenB;


      //  print.printLinkedListElements(headA);
        addTwoNumbers(headB, headA);

    }
}
