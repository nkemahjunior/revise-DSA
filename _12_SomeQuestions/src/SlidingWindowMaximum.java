import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * given an array of integers arr, there is a sliding window of size k, which is moving from the very left of the array to the very right. You can see
 * k numbers in the window each time the sliding window moves right by one position. Return the max sliding window
 *
 * @Example input = arr = [44, 77, 33, 44, 88, 11], k = 3
 *         output = [77, 77, 88, 88]
 *
 *         EXPLANATION: here is how we got the output
 *
 *            window position ( represented using brackets)                       Max
 *            [ ( 44, 77, 33), 44, 88, 11 ]                                        77
 *            [ 44, (77, 33, 44), 88, 11 ]                                         77
 *            [ 44, 77, (33, 44, 88), 11 ]                                         88
 *            [  44, 77, 33, (44, 88, 11) ]                                        88
 *
 *            Remember the next greater element algorithm (check it under the stacks module)
 */
public class SlidingWindowMaximum {

    static List<Integer> maxSlidingWindow(int[] arr, int k){

        int[] ngeArr = nextGreaterElement(arr);
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i <= arr.length - k; i++){
            int j = i;

            while(ngeArr[j] < i + k){
                j = ngeArr[j];
            }

            result.add(arr[j] );
        }

        return result;
    }

    static int[] nextGreaterElement(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for(int i= arr.length- 1; i >= 0; i-- ){

            if(!stack.isEmpty()){
                while ( !stack.isEmpty() && arr[stack.peek()] <= arr[i] ){
                    stack.pop();
                }
            }

            if(stack.empty()){
                result[i] = arr.length;
            }else{
                result[i] = stack.peek();
            }

            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxSlidingWindow(new int[]{4, 77, 33, 44, 88, 11}, 3));
    }
}
