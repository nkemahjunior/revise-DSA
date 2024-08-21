/**
 * A subsequence of a string is a new string formed from the original string by deleting some or no characters without changing the order of remaining characters
 * @Example
 *  "ace", "abcde" are subsequence of "abcde"
 *  "aec" is not a subsequence of "abcde"
 */
public class Subsequence {


    boolean isSubSeq(String str, String seq){
        //example
        // str = "abcde"
        //seq = "ace"

        int i = 0;
        int j = 0;

        while( i < str.length() && j < seq.length()){

            if(str.charAt(i) == seq.charAt(j)) {
                j++;
            }

            i++;
        }

        return j == seq.length();
    }
}
