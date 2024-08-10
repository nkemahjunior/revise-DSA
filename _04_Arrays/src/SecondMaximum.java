import java.util.Arrays;

public class SecondMaximum {

    public static int  secondMaximum(int[] arr){

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for( int i= 0; i< arr.length ; i++){

            if( arr[i] > max){

                // update 2nd second value with the current max value
                secondMax = max;

                //update the max value with the new-found max value
                max = arr[i];

                //if the current value is not greater than max, it might be greater than second max, so lets check, and we need to be show this value is not the max value
            }else if( arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }

        }

        return  secondMax;
    }

    public  static  void main(String[] args){

        int secondMax = secondMaximum(new int[]{13, 34, 2, 34, 33, 1,40, 41});
        System.out.println(secondMax);
    }
}
