public class DoubleListNode {

    protected   int data;
    protected DoubleListNode next;
    protected DoubleListNode previous;

    public DoubleListNode(int data){
        this.data = data;
        //this.next = null;
    }

    @Override
    public String toString() {
        return "DoubleListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
