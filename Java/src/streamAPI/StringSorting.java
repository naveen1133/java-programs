package streamAPI;

import java.util.stream.Collectors;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "wbbAuuZvfqaZ";
		
		String a = s.chars().sorted().mapToObj(ch -> String.valueOf((char) ch)).collect(Collectors.joining());
		System.out.println(a);

	}

}
