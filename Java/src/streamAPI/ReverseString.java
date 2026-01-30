package streamAPI;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Naveen";
		String a = s.chars().mapToObj(c -> (char) c)                 // convert int to char
                .collect(StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append)
               .reverse()
               .toString();
		
		System.out.println(a);

	}

}
