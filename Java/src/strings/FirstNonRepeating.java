package strings;

public class FirstNonRepeating {
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

            if (count == 1) {
                System.out.println("First non-repeating character: " + c[i]);
                return; // stop after finding the first one
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
