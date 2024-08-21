import java.util.Set;

/**
 * given a lower case string, remove vowels from the string and return the string without vowels
 * @Example  input = "what is your name"
 *          output " wht is yr nm"
 */
public class RemoveVowelsFromString {

    String removeVowels(String str){
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        StringBuilder sb = new StringBuilder();

        char[] charArray = str.toCharArray();

        for(Character ch: charArray){
            if(!vowels.contains(ch)){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
