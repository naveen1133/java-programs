package strings;

public class ReverseEveryThreeChars {
    public static void main(String[] args) {
        String s = "ABCDEFGHI";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            int end = Math.min(i + 2, s.length());
            String group = s.substring(i, end);
            result.append(new StringBuilder(group).reverse());
        }

        System.out.println("Output: " + result.toString());
    }
}

