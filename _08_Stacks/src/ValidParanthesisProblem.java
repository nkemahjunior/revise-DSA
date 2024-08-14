import java.util.Stack;

public class ValidParanthesisProblem {

    /**
     * Given a  string s, containing just the characters '(', ')', '[', ']', '{', '}'.. determine if the input string is valid
     * An input is valid if:
     * - Open brackets must be close by the same type of brackets
     * -open brackets must be closed in the same order
     *
     * Example
     * input: str = "{()}" output: true
     * input: str = "{]" output : false
     * input: str = "{()" output: false
     * **/

    public static  boolean isValidParenhtesis(String s){
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if( c == '(' || c == '{' || c ==  '['){
                stack.push(c);
            }else {
                if(stack.empty()){
                    //returning false here because if the stack is empty, it means there is no opening bracket ( either " (, { , [ "  ) so we return false , since
                    // the string can not be valid if it did not start with its opening bracket
                    return false;
                }else{
                    char top = stack.peek();

                    if( (c == ')' && top =='(') || (c == '}' && top =='{') || (c == ']' && top =='[')  ){
                        stack.pop();
                    }else {
                        return false; // there was an element in the stack but c did not match top of stack... so invalid. e.g say c = { and peek = ], {] is invalid
                    }
                }
            }
        }

        return stack.empty(); // we successfully compare the elements and popped everything so stack is empty now, meaning string was valid
    }

    public static void main(String[] args) {

        //String s = "({[";
        String s = "({[]})";
        System.out.println(isValidParenhtesis(s));

    }
}
