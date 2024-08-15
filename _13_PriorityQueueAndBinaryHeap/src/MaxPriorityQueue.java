import java.util.Arrays;

public class MaxPriorityQueue {

    Integer[] heap;
    int n;

    public MaxPriorityQueue(int capacity) {

        heap = new Integer[capacity + 1]; // adding + 1 because we dont store any element at index 0 of the array
        n = 0;
    }

    public boolean isEmpty(){
        return  n == 0;
    }

    public int size(){
        return  n;
    }

    public void resize(int capacity){
        Integer[] temp = new Integer[capacity];
        for( int i = 0; i < heap.length; i++){
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void  insert(int x){
        //check if heap is full... - 1 because we dont store anything at index 0 of the heap array
        if( n == heap.length - 1) resize(2 * heap.length);

        n++;
        heap[n] = x;
        swim(n);
    }

    public void swim(int k){

        //check if parent node is smaller than the child... read the readme.md to know more about this formula
        while( k > 1 && heap[k/2] < heap[k]){
            int temp = heap[k];
            heap[k] = heap[k/2];
            heap[k/2] = temp;

            // move k to the parent node of the k node.. so we can keep comparing the nodes and see if they are at their right positions
            k = k/2;
        }
    }

    public void deleteMax(){
        //in a Max heap, the largest value will always be at index 1 of the array.... read the readme.md file
        int max = heap[1];
        int min = heap[n];

        heap[1] = min;
        heap[n] = max;
        heap[n] = null;

        // number of elements in the array have reduced
        n--;

        sink(1);

        //resize the array after deleting an element
        if( n > 0 && (n == (heap.length-1)/4 ) ){
            resize(heap.length / 2);
        }


    }

    public void sink(int k){
        // read the readme.md file

        // we keep swapping until a node is not more larger than its children
        while(  (heap[k] <= heap[2*k] || heap[k] <= heap[2*k+1])){

            int childOneIndex = 2*k;
            int childTwoIndex = 2*k+1;

            int largestChildIndex = heap[childOneIndex] > heap[childTwoIndex] ? childOneIndex : childTwoIndex;

           // if( heap[k] < heap[largestChildIndex]){
                //swap
                int temp = heap[k];
                heap[k] = heap[largestChildIndex];
                heap[largestChildIndex] = temp;
           // }


            k = largestChildIndex;

            // out of bounds and remember we dont store anything at index 0 of the heap array
            if( k*2 > heap.length - 1 || 2*k+1 > heap.length - 1  ) break;

            // no need to check null elements my boy
            if( heap[k*2] == null || heap[2*k+1] == null) break;

        }


    }





    public static void main(String[] args) {
        MaxPriorityQueue pq = new MaxPriorityQueue(3);

        /***           //what the tree will look like after inserting
         *                                 6
         *                               /    \
         *                              5       3
         *                             /  \    / \
         *                            4    1   2
         * */

        pq.insert(4);
        pq.insert(5);
        pq.insert(2);
        pq.insert(6);
        pq.insert(1);
        pq.insert(3);




       // System.out.println(pq.size());
      //  System.out.println(pq.isEmpty());
       pq.deleteMax();

        /***           //what the tree will look like after deleting 6 and running the sink method on the tree
         *                                 5
         *                               /    \
         *                              4       3
         *                             /  \    / \
         *                            2   1
         * */

        System.out.println(Arrays.toString(pq.heap));

    }
}
