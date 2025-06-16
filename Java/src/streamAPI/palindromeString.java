package streamAPI;

import java.util.stream.Collectors;

public class palindromeString {
    public static void main(String[] args) {
    	 String s = "nanan";

         String reversed = new StringBuilder(s)
                 .reverse()
                 .toString();  // Internally it uses array manipulation

         if (s.equals(reversed)) {
             System.out.println(s + " is a palindrome");
         } else {
             System.out.println(s + " is not a palindrome");
         }
    }
}
