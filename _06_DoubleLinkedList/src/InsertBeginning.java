public class InsertBeginning {

    public DoubleListNode head;
    public DoubleListNode tail;
    public int length;

    public InsertBeginning() {
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

    public void insertAtBeginning(int data){

        DoubleListNode newNode = new DoubleListNode(data);

        if(head  == null){
            tail = newNode;
        }else{
            head.previous = newNode;
        }

        newNode.next = head;
       // head.previous = newNode;
        head = newNode;
        length++;
    }

    public static void main(String[] args) {
        InsertBeginning insert = new InsertBeginning();
        PrintElementsOfDoubleLinkList print = new PrintElementsOfDoubleLinkList();

        insert.insertAtBeginning(3);
        insert.insertAtBeginning(2);
        insert.insertAtBeginning(1);

        print.printDoubleLinkedListPrevious(insert.tail);

    }
}


