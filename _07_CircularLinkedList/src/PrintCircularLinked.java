public class PrintCircularLinked {

    public  void printCircularListNodes(CircularListNode last){

        if(last == null) return;

        CircularListNode first = last.next;

        while( first != last){
            System.out.println(first.data + "--> ");
            first = first.next;
        }

        //print last node after traversing the list
        System.out.println(first.data + " ");
    }
}
