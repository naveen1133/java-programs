package strings;

public class CountingInString {

    public static void main(String[] args) {
        String s = "naveen";
        
        char[] c = s.toCharArray();
        boolean[] counted = new boolean[c.length]; // To track already counted characters
        
        for (int i = 0; i < c.length; i++) {
            if (!counted[i]) { // Skip already counted characters
                int count = 1;
                for (int j = i + 1; j < c.length; j++) {
                    if (c[i] == c[j]) {
                        count++;
                        counted[j] = true; // Mark as counted
                    }
                }
                System.out.println("Character: " + c[i] + ", Count: " + count);
            }
        }
    }
}
