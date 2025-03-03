package strings;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s ="naveen";

int v=0;
int c=0;

for(int i=0; i<s.length();i++) {
	char ch= s.charAt(i);
	
	 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
         v++;
     }
	 else {
		 c++;
	 }
	
}
System.out.println("Number of vowels: " + v);
System.out.println("Number of remaining letters (consonants): " + c);
}

}
