import java.util.*;

/**
 * You are given the head of a linked list.
 * Remove every node which has a node with a greater value anywhere to the right side of it.
 * Return the head of the modified linked list.
 *
 * Input: head = [5,2,13,3,8]
 * 5->2->13->3->8
 *
 * Input: head = [5,2,13,3,8]
 * Output: [13,8]
 * Explanation: The nodes that should be removed are 5, 2 and 3.
 * - Node 13 is to the right of node 5.
 * - Node 13 is to the right of node 2.
 * - Node 8 is to the right of node 3.
 */
public class RemoveNodesFromLinkedList {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
    }


    // solution: not really efficient
    // place elements in stack, but before placing the element in the stack, check if its greater than the current top of stack
    // if its greater keep popping untill the element is not more greater than top of stack, then add the element to the stack
    //
    // after put all the elements in an array, then create the result linked list by lopping through the array starting end
    public static ListNode removeNodes(ListNode head) {

        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head.next;
        stack.push(head);

        while (temp != null ){
            if( temp.val > stack.peek().val){
                while (!stack.isEmpty() &&  temp.val > stack.peek().val ){
                    stack.pop();
                }
            }
            stack.push(temp);
            temp = temp.next;
        }

        int[] hold = new int[stack.size()];
        int i = 0;
        while(!stack.isEmpty()){
            hold[i] = stack.pop().val;
            i++;
        }

        ListNode headNew = new ListNode(hold[hold.length - 1]);;
        ListNode finalHead = headNew;

        for(int j = hold.length - 2; j >= 0 ; j--){
                headNew.next = new ListNode(hold[j]);
                headNew = headNew.next;
        }


        return finalHead;
    }

    public static void main(String[] args) {
        // Creating the linked list: 5 -> 2 -> 13 -> 3 -> 8
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);

        removeNodes(head);

    }
}
