public class CircularListNode {

    public CircularListNode next;
    public int data;

    public CircularListNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CircularListNode{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}
