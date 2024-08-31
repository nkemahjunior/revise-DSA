import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * GOOD EXPLANATION OF THIS PROBLEM = https://dev.to/alisabaj/the-zigzag-conversion-problem-3nne
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 *
 *
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * Example 3:
 *
 * Input: s = "A", numRows = 1
 * Output: "A"
 */
public class ZigZagConversion {

    public static String convert(String s, int numRows) {

        if( numRows == 1 || s.length() < numRows) return s;


        List< List<Character> > rows = new ArrayList<>();
        int currentRow = 0;
        boolean reverse = false;

        //each line will be a new array in the rows array, so if numRows = 3, we will have three lines in the array
        for(int i =0; i < numRows; i++){
            rows.add(new ArrayList<>());
        }

        for(int i =0; i < s.length() ; i++){

            rows.get(currentRow).add(s.charAt(i));

            if(!reverse){
                currentRow++;
            }else {
                currentRow--;
            }

            // change direction when we reach either the top or bottom of the array
            if(currentRow == 0 || currentRow == numRows - 1){
                reverse = !reverse;
            }


        }

        StringBuilder sb = new StringBuilder();
        //joining the letters
        rows.forEach(
                el -> el.forEach(
                        character -> sb.append(character)
                )
        );

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("abcdefgh", 3));
    }
}
