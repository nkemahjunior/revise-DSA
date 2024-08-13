public class PrintElementsOfDoubleLinkList {


    public void printDoubleLinkedList(DoubleListNode head){

        if(head == null ) return;

        DoubleListNode temp = head;
        while(temp != null){
            System.out.println(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printDoubleLinkedListPrevious(DoubleListNode tail){

        if(tail == null ){
            System.out.println("tail is null");
            return;
        }


        DoubleListNode temp = tail;

        while(temp != null){
            System.out.println(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

}

