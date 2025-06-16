package strings;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String input = "naveen";

        Set<Character> uniqueOrdered = new LinkedHashSet<>();
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            uniqueOrdered.add(chars[i]);
        }

        StringBuilder result = new StringBuilder();
        // Using for loop to build the string
        Character[] uniqueArray = uniqueOrdered.toArray(new Character[0]);
        for (int i = 0; i < uniqueArray.length; i++) {
            result.append(uniqueArray[i]);
        }

        System.out.println("String without duplicates: " + uniqueOrdered.toString());
    }
}
