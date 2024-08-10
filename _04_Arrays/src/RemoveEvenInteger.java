import java.util.Arrays;

public class RemoveEvenInteger {

    public static void removeEvenInteger(Integer[] arr){

        for(int i = 0; i < arr.length ; i++){

            if(arr[i] % 2 == 0){
                arr[i] = null;
            }
        }

    }


    public static void main(String[] args){

        Integer[] arr = {3, 9, 2, 7, 4, 6, 15};
        removeEvenInteger(arr);
        System.out.println(Arrays.toString(arr));
    }
}
