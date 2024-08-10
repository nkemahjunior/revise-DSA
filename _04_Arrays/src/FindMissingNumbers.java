import java.util.Arrays;
import java.util.List;

public class FindMissingNumbers {

    public static int[] findMinMaxThenCountFromMinToMax(int[] arr){

        int max = arr[0];
        int min = arr[0];


        for( int i = 0; i < arr.length; i++){
            if( arr[i] > max)
                max = arr[i];

            if(arr[i] < min)
                min = arr[i];
        }

        int[] hold = new int[max];
        int j =0;

        for( int i = min; i <= max ; i++){
            hold[j] = i;
            j++;
        }
        return hold;

    }



   public static void findMissingNumbers(int[] arr){

      int[] hold = findMinMaxThenCountFromMinToMax(arr);

       Boolean notFound = null ;

        for(int i = 0; i < hold.length ; i++){

            notFound = true;

            for(int k = 0; k < arr.length ;k++) {
                //System.out.println("entered " + i);
                if (hold[i] == arr[k]) {
                    //System.out.println("executed " + i);
                    notFound = false;
                    break;
                }
            }

           if( notFound){
                System.out.println("not found");
                System.out.println(hold[i]);
           }

        }

  }

    public static  void main (String[] args){
        //there is more efficient approach using one mathematical formula--- check the video

        int [] arr = {2, 4, 1, 8, 6, 3, 7,9,9}; // 5 is missing
        findMissingNumbers(arr);

    }


}

