public class DeleteNodeBeginning {

    public static DoubleListNode head;
    public static DoubleListNode tail;

    public static DoubleListNode second;
    public static DoubleListNode third;


    public static void  deleteAtBeginning(){

        //if only one node exist
        if( head == tail) tail = null;

        DoubleListNode nextNode = head.next;
        nextNode.previous = null;
        head.next = null;
        head = nextNode;
    }




    public static void main(String[] args) {

        PrintElementsOfDoubleLinkList print = new PrintElementsOfDoubleLinkList();

        head = new DoubleListNode(1);
        second = new DoubleListNode(2);
        third = new DoubleListNode(3);
        tail = new DoubleListNode(4);

        //connecting them
        head.next = second;
        second.next = third;
        third.next = tail;

        second.previous = head;
        third.previous = second;
        tail.previous = third;

        deleteAtBeginning();

        print.printDoubleLinkedList(head);
        print.printDoubleLinkedListPrevious(tail);
    }
}
