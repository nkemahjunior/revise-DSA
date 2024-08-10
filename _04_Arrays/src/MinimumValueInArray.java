public class MinimumValueInArray {

    public static int minimumValue(int[] arr){

        int min = arr[0];

        for( int i = 0; i < arr.length ; i++){

            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }


    public static  void main(String[] args){

        int min = minimumValue(new int[]{1, 4, 9, 10, 10,2, 13, 15,0});
        System.out.println(min);
    }
}
