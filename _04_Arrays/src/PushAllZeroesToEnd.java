import java.util.Arrays;

public class PushAllZeroesToEnd {


    public static void pushAllZeroesToEnd(int[] arr){

        //we will use j as a pointer to zero elements, and only change its position when it is pointing to non zero elements
        int j = 0;


        for (int i = 0; i < arr.length; i++){

            if( arr[i] != 0 && arr[j] == 0){
                //swapping i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            //change position of j, when its not pointing to a non zero element
            if(arr[j] != 0){
                j++;
            }
        }
    }

    public static  void main(String[] args){

        int [] arr = {0, 1, 0, 4, 12, 0, 0, 5, 8, 9};
        pushAllZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
