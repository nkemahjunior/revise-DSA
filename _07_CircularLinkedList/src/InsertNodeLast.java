public class InsertNodeLast {

    private static CircularListNode last;
    private static CircularListNode first;
    private static CircularListNode second;
    private static CircularListNode third;
    private static CircularListNode fourth;

    private static  void insertAtTheEnd(int value){

        CircularListNode newNode = new CircularListNode(value);

        if(last == null){
            last = newNode;
            last.next = newNode;
            return;
        }

        newNode.next = last.next; // remember last.next is pointing to the first node
        last.next = newNode;
        last = newNode;
    }


    public static void main(String[] args) {

        PrintCircularLinked print = new PrintCircularLinked();

        first = new CircularListNode(1);
        second = new CircularListNode(2);
        third = new CircularListNode(3);
        fourth = new CircularListNode(4);

        //connecting nodes
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;// circular linked list

        last = fourth;

        insertAtTheEnd(40);

        print.printCircularListNodes(last);
    }
}
