import java.util.Arrays;

public class NextGreaterElement {

    //given an array, create a new output array which contains the next bigger number for each number
    //if there is no greater element return -1
    // e.g

    // input = [4,7,3,4,8,1]
    //output=[7, 8, 4 8, -1, -1 ]


    public static void main(String[] args) {

        int[] input = {4,7,3,4,8,1};
        int[] output = new int[input.length];

        int i = 0;
        int j = 1;

        while ( i < input.length && j<= input.length ){

            if(input[j] > input[i]){

                output[i] = input[j];
                i++;
                //j = i + 1;
                j = i == input.length - 1 ? i : i +1;

            } else {
                if(j == input.length - 1){
                    output[i] = -1;
                    i++;
                    //j = i + 1;
                    j = i == input.length - 1 ? i : i +1;
                } else{
                    j++;
                }


            }

        }

        System.out.println(Arrays.toString(output));
    }
}
