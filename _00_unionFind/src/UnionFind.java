public class UnionFind {

    private int[] id ;

    public UnionFind(int N){
        id = new int[N];

        for(int i = 0; i < N; i++){
            //putting numbers in the array
            id[i] = i;
        }
    }


    boolean connected(int p, int q) {
        return id[p] == id[q];
    }


    //Not efficient, since in some cases, we need to loop through all the elements in the array, or loop through a large number of elements
    void union(int p, int q){
        int pid = id[p];
        int qid = id[q];

        for(int i = 0; i < id.length; i++ ){

            //quick find approach: check all values of the array.. if the id value of element i  == id value of p, change the id value of element i to have the same id value as that of q
            //check video at 3:01 to see demo
            if(id[i] == pid) id[i] = qid;
        }
    }


    int find(int p) {return 0;}

    int count(){ return  0;}
}
