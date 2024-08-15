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

    public static void main(String[] args) {
        MaxPriorityQueue pq = new MaxPriorityQueue(3);

        pq.insert(4);
        pq.insert(5);
        pq.insert(2);
        pq.insert(6);
        pq.insert(1);
        pq.insert(3);




        System.out.println(pq.size());
        System.out.println(pq.isEmpty());

    }
}
