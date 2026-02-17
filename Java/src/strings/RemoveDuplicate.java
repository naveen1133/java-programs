
package strings;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "naveen";
        char[] c = s.toCharArray(); // Convert string to char array

        StringBuilder result = new StringBuilder(); // To store the result

        for (int i = 0; i < s.length(); i++) { // Outer loop
            boolean isDuplicate = false;

            // Check if character is already present in the result
            for (int j = 0; j < result.length(); j++) { // Inner loop to compare with result
                if (c[i] == result.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // If character is not duplicate, append to result
            if (!isDuplicate) {
                result.append(c[i]);
            }
        }
   
        // Print the final string after removing duplicates
        System.out.println("Original String: " + s);
        System.out.println("String after removing duplicates: " + result.toString());
        


        String input = "programming";
        String result1 = "";

        for (int i = 0; i < input.length(); i++) {
            char d = input.charAt(i);

            if (result1.indexOf(d) == -1) {
                result1+= d;
            }
        }

        System.out.println(result1);
    
    }

}
