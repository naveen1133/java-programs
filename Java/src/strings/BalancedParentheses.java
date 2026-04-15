package strings;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String s = "{(hello)(world)}";
        System.out.println(isBalanced(s));
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // If opening brackets, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // If closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                // If stack is empty → invalid
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching pair
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack empty → balanced
        return stack.isEmpty();
    }
}