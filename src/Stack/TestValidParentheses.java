package Stack;

import java.util.Stack;

public class TestValidParentheses {

    private String leftStr = "{[(<";

    public boolean isValid(String str) {

        Stack<Character> stack = new Stack();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '{' || c == '[' || c == '(' || c == '<') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (c == ')' && topChar != '(')
                    return false;
                if (c == ']' && topChar != '[')
                    return false;
                if (c == '}' && topChar != '{')
                    return false;
                if (c == '>' && topChar != '<')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new TestValidParentheses().isValid("{{}}}{{}}"));
        System.out.println(new TestValidParentheses().isValid("{{}<>}()"));
    }

}
