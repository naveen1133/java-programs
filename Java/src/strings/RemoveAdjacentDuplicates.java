package strings;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String a = "rcbbcrrcbaabbaa";
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < a.length()-1; i++) {
            // Append the first character always
            if (s.length() == 0 || s.charAt(s.length() - 1) != a.charAt(i)) {
//            	s.deleteCharAt(i);
                s.append(a.charAt(i));
            }
        	

        }

        System.out.println("String after removing adjacent duplicates: " + s.toString());
    }
}
