package strings;

public class SortString {

	public static void main(String[] args) {
		String s ="gdlhc";
		
		char[] c= s.toCharArray();
		
		for(int i=0; i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(c[i]>c[j]) {
					char temp = c[i];
					c[i]=c[j];
					c[j]=temp;	
				}
			}
		}
		//String sortedString = new String(c);

		
        // Print the sorted string
        System.out.println(c);
	}

}
