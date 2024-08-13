public class RemoveFirstNode {

    private static CircularListNode last;
    private static CircularListNode first;
    private static CircularListNode second;
    private static CircularListNode third;
    private static CircularListNode fourth;

    private static  void removeFirst(){

        //only one node in list ?
        if(last.next == last) {
            last = null;
            return;
        }


        CircularListNode temp = last.next;
        last.next = temp.next;
        temp.next = null;


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

        removeFirst();

        print.printCircularListNodes(last);
    }
}
