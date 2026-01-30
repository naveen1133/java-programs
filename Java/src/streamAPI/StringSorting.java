package streamAPI;

import java.util.stream.Collectors;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "wbbAuuZvfqaZ";
		
		String a = s.chars().sorted().mapToObj(ch -> String.valueOf((char) ch)).collect(Collectors.joining());
		String ab= s.chars().sorted().distinct().mapToObj(ch -> String.valueOf((char) ch)).collect(Collectors.joining());
		String b= s.chars().distinct().mapToObj(ch -> String.valueOf((char) ch)).collect(Collectors.joining());
		System.out.println(a);
		System.out.println(ab);
		System.out.println(b);

	}

}
