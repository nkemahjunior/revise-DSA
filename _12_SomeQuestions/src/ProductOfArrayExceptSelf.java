/**
 * Given an array of integers arr[], return an array result[] such that result is equal to the product of all the elements of arr except arr[i]. The product fits in 32-bit integer. The algorithm
 * should run in O(n) time and without using division operator;
 *
 * @Example  input = [1, 2, 3, 4]
 *   result = [24, 12, 8, 6]
 */
public class ProductOfArrayExceptSelf {


    int [] findProduct(int[] arr){
        int temp = 1;
        int[] result = new int[arr.length];

        for(int i  = 0; i < arr.length; i++){
            result[i] = temp;
            temp = temp * arr[i];
        }

        temp = 1;
        for(int i = arr.length - 1; i >= 0; i--){
            result[i] = result[i] * temp;
            temp = temp * arr[i];
        }

        return result;
    }
}
