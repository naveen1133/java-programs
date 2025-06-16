package strings;


public class RemoveAdjacentDuplicates {

    public static void main(String[] args) {
        String input = "nnaveenaa";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            // Append the first character or if current char is different from previous char
            if (i == 0 || input.charAt(i) != input.charAt(i - 1)) {
                result.append(input.charAt(i));
            }
        }

        System.out.println("String after removing adjacent duplicates: " + result.toString());
    }
}
