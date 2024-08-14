import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    /***
     * QUESTION : generate binary numbers from 1 to N using a Queue.
     * EXAMPLE : input n = 3    output = {"1", "10", "11"}
     *
     * QUEUE representation    <-- exit [  ] <-- enter...... FIFO
     * HINTS
     *  1 = 1
     *  10 = 2
     *  11 = 3
     *  100 = 4
     *  101 = 5
     *  110 = 6
     *  111 = 7
     *  .....
     *
     *  you can easily calculate the next binary number in sequence using this tree
     *
     *                                          1
     *                           append 0    /      \ append 1
     *                                     10         11
     *                                   /  \       /   \
     *                                100  101     110   111
     *                              /  \   / \    /  \   / \
     *                              ............................
     *
     *         so here is how the tree work.. we start from 1,
     *         next we create another smaller tree for 1 .. at each step we append 0 on the left and 1 on the right
     *         next for each node of the sub tree of 1( 10 and 11) we repeat the same process
     *
     *         So how do we represent this in a program ? we use a QUEUE
     *         at the start we add 1 to our queue, then we remove it and create its subtree and append 0 and 1 respectively, the we add the nodes of the subtree to the queue (10 ,11)
     *        next we remove 10 and create it's sub tree by apending  0 and 1 respectively, then we do add 100, 101 to the queue..}
     *        next we pick the next element in the queue which is 11 do thesame process then add 110, 111 to the queue
     *        next we pick 100 from the queue, do thesame process and so on...
     *
     *         Remember a queue is A FIFO.... this is how our queue will look like at different steps
     *       step 1: queue = [1]
     *       step 2: queue =  front <-[10, 11] -> rear of queue, remember queue is FIFO
     *       step 3: queue = [11,100,101]
     *       step 4 : queue = [100, 101, 110, 111]
     *         **/

    public static String[] gnerateBinaryNums(int n){
        String[] result = new String[n];
        Queue<String> q = new LinkedList<>();

        q.offer("1");
        for(int i = 0 ; i < n ; i++){
            result[i] = q.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";

            q.offer(n1);
            q.offer(n2);
        }

        return  result;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(gnerateBinaryNums(7)));
    }
}