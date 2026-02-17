package strings;

public class EqualBrackets {

    public static void main(String[] args) {
        String s = "}(hello)(world";
        int open = 0;
        int close = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' && c =='{') {
                open++;
            } else if (c == ')' && c=='}') {
                close++;
            }
        }

        if (open == close) {
            System.out.println(1);  // equal count
        } else {
            System.out.println(0);  // unequal
        }
    }
}
