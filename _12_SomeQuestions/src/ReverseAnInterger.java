/**
 * Given an integer x, return x with it's DIGITS reversed
 *
 * @Example input = 1234
 *          output = 4321
 *
 * @Example input = -1234
 *          output = -4321
 */
public class ReverseAnInterger {

    //another method is to convert the integer to string and store in a character array, then print backward
    long reverse(int number){
        boolean isNegative = number < 0;

        if(isNegative){
           number = number * -1;
        }

        long reverse = 0;
        int lastDigit;

        while(number > 0){
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        return isNegative ? reverse * -1 : reverse;
    }
}
