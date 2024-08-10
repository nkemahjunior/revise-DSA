import java.util.Arrays;

public class ResizeArray {

    public static int[] resizeArray(int[] arr, int capacity){

        int[] temp = new int[capacity];

        //you could use System.arrayCopy
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }

        arr = temp;
        return arr;
    }


    public static  void main(String[] args){

        int[] arr = new int[]{1,2};
       arr =  resizeArray(arr,10);
        System.out.println(arr.length);
    }
}
