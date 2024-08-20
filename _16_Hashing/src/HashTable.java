public class HashTable {

    private HashNode<Integer, String> [] buckets;
    private int numOfBuckets;
    private int size; //number of key value pairs in hash table or number of hash nodes

    public HashTable(int capacity) {
        this.numOfBuckets = capacity;
        buckets = new HashNode[capacity];
        this.size = 0;
    }

    private static class  HashNode <K, V>{
        private  K key;
        private V value;
        private HashNode<K,V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size(){
        return size;
    }

    public  boolean isEmpty(){
        return size == 0;
    }

    public void put(Integer key, String value){
        // I am not implementing you bro
    }

    public String get(Integer key){
        //check timestamp 36:37:12
        //I am not also doing you
        return null;
    }

    public void remove(Integer key){
        //check timestamp 36:51:56
        // I am not also doing you
    }
}
