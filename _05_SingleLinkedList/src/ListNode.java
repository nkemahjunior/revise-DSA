public class ListNode {

    protected   int data;
    protected ListNode next;

    public ListNode(int data){
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
