package streamAPI;

import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "naveen";
        
        // Remove duplicates using streams
        String result = s.chars()                             // Convert the string to an IntStream of characters
                         .distinct()                        // Remove duplicates
                         .mapToObj(c -> String.valueOf((char) c)) // Convert each int to a char
                         .collect(Collectors.joining());     // Collect the result into a new string
        
        System.out.println("Original String: " + s);
        System.out.println("String after removing duplicates: " + result);

	}

}
