package linkedhashset;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {4,5,4,2,3,4,2,6,8,8};
		Set<Integer> s = new LinkedHashSet<>();
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
		for(int i=0;i<a.length;i++) {
			s.add(a[i]);
		}
		System.out.println(s);

	}

}
