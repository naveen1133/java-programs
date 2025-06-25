package strings;

public class Palindrome {

    public static void main(String[] args) {
        
        String s = "Navan";  // Original string
        
//        StringBuilder sb = new StringBuilder();  
//        sb.append(s);        
//        sb.reverse();        
//
//        if(sb.toString().equals(s)) {   // Compare reversed string to original
//            System.out.println(s + " is a palindrome");
//        } else {
//            System.out.println(s + " is not a palindrome");
//        }
        
        char[] c = s.toCharArray();
        String r="";
        for(int i=s.length()-1;i>=0;i--) {
        	r+=c[i];
        }
        System.out.println(r);
        if(r.equalsIgnoreCase(s)) {
        	System.out.println(s + " "+ "is a palindrome");
        }
        else {
        System.out.println(s + " "+ "is not a palindrome");
        }
    }
}
