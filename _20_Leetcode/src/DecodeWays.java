import java.util.Map;

/**
 * You have intercepted a secret message encoded as a string of numbers. The message is decoded via the following mapping:
 *
 * "1" -> 'A'
 *
 * "2" -> 'B'
 *
 * ...
 *
 * "25" -> 'Y'
 *
 * "26" -> 'Z'
 *
 * However, while decoding the message, you realize that there are many different ways you can decode the message because some codes are contained in other codes ("2" and "5" vs "25").
 *
 * For example, "11106" can be decoded into:
 *
 * "AAJF" with the grouping (1, 1, 10, 6)
 * "KJF" with the grouping (11, 10, 6)
 * The grouping (1, 11, 06) is invalid because "06" is not a valid code (only "6" is valid).
 * Note: there may be strings that are impossible to decode.
 *
 * Given a string s containing only digits, return the number of ways to decode it. If the entire string cannot be decoded in any valid way, return 0.
 *
 * The test cases are generated so that the answer fits in a 32-bit integer.
 */
public class DecodeWays {
    public static int numDecodings(String s) {
        //Map<String,>
        int numOfWays = 0;
        String key = "";


        for(int i = 0; i < s.length(); i++){

            int curNum = Character.getNumericValue(s.charAt(i));

            if( curNum > 0 && curNum <= 26 ){
                numOfWays++;
            }

            key = key + s.charAt(i);
            int keyyy = Integer.parseInt(key);

            if(key.length() > 1){
                if( keyyy > 0 && keyyy <= 26  ){
                    numOfWays++;
                }else {
                    key = "";
                }
            }





        }

        return numOfWays;
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("226"));
        System.out.println("----------------------");
        System.out.println(65);
        System.out.println(3/2);
    }
}
