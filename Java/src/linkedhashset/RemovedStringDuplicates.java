package linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovedStringDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String st = "naveeengufefew";
	Set<Character> n = new LinkedHashSet<>();
	for(int i=0;i<st.length();i++) {
		n.add(st.charAt(i));
		}
	StringBuilder result = new StringBuilder();
		for (char c : n) {
	    result.append(c);
		}
System.out.println(result.toString());

	}

}
