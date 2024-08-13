public class InsertLastPosition {

    public DoubleListNode head;
    public DoubleListNode tail;
    public int length;

    public InsertLastPosition() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int getLength() {
        return length;
    }


    public  void insertNodeLastPosition(int data){

        DoubleListNode newNode = new DoubleListNode(data);

        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
        }

        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    public static void main(String[] args) {
        InsertLastPosition insert = new InsertLastPosition();
        PrintElementsOfDoubleLinkList print = new PrintElementsOfDoubleLinkList();

        insert.insertNodeLastPosition(1);
        insert.insertNodeLastPosition(10);
        insert.insertNodeLastPosition(15);
        insert.insertNodeLastPosition(25);

        print.printDoubleLinkedList(insert.head);
        print.printDoubleLinkedListPrevious(insert.tail);

    }
}
