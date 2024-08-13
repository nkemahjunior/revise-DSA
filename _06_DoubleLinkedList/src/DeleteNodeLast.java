public class DeleteNodeLast {

    public static DoubleListNode head;
    public static DoubleListNode tail;

    public static DoubleListNode second;
    public static DoubleListNode third;

    public static void deleteTheLastNode(){

        //if only one node exist
        if( head == tail) head = null;

        DoubleListNode prevNode = tail.previous;
        prevNode.next = null;
        tail.previous = null;
        tail = prevNode;
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

        deleteTheLastNode();

        print.printDoubleLinkedList(head);
        print.printDoubleLinkedListPrevious(tail);
    }
}
