package strings;

public class CountingInString {

    public static void main(String[] args) {
        String s = "naveen";

        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == '0') {
                continue; // already counted
            }

            int count = 1;

            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    count++;
                    c[j] = '0'; // mark as counted
                }
            }

            System.out.println("Character: " + c[i] + ", Count: " + count);
        }
    }
}
