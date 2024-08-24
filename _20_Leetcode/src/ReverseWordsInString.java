import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class ReverseWordsInString {

        public static String reverseWords(String s) {

            StringBuilder sb = new StringBuilder();
            char[] arr = s.toCharArray();
            Stack<String> stack = new Stack<>();

            for(int i=0; i < arr.length; i++){

                //skip double spaces
                int k = i == arr.length - 1 ? i : i +1;
                if( arr[i] == ' ' && arr[k] == ' ' && i != k) continue;

                //append the letters
                sb.append(s.charAt(i));

                //push word to stack when you encounter a space or at the last word
                if( arr[i] == ' ' || i == k){
                    //append space to end of string if there's no space at the last word
                    if( i == k && arr[i] != ' ' ){
                        stack.push(sb.append(" ").toString());
                    }else {
                        stack.push(sb.toString());
                    }
                    sb.setLength(0);
                }
            }


            //forming the string back in reverse order
            int size = stack.size();
            int i = 0;
            while (!stack.isEmpty()){
                String str = stack.pop();
                sb.append( str);
                i++;
            }

            return sb.toString().trim();
        }

        public static void main(String[] args) {
            System.out.println( "'"+reverseWords("  hello world  ")+"'");


        }
    }

