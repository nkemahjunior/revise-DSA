import java.util.Stack;

public class ReverseAStringUsingStack {

    public static void main(String[] args) {

        String str = "ABCD";

        Stack<Character> stack = new Stack<>();

        char[] chars = str.toCharArray();

        for(char c : chars){
            stack.push(c);
        }

        for(int i = 0; i < str.length(); i++){
            chars[i] = stack.pop();
        }

        String reverseString = new String(chars);
        System.out.println(reverseString);

    }
}
