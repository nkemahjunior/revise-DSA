import java.util.Arrays;

public class ReverseArray {

   /* my implementation
    public static int[] reverseArray(int[] arr){

        int[] hold = new  int[arr.length];
        int j = 0;

        for( int i = arr.length - 1  ; i >= 0 ; i-- ){
            hold[j] = arr[i];
            j++;
        }

        return hold;
    }*/

    /* instructor's implementation*/
    public static void reverseArray(int[] arr, int start, int end){

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end --;
        }
    }


    public static void main(String[] args){

        int[] arr = {2, 11, 5, 10, 7, 8};
        //int[] reverseArray = reverseArray(arr);

        reverseArray(arr,0 , arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
