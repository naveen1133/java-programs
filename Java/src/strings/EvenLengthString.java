package strings;

public class EvenLengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "I am Naveen kohli";
		
		for(String s: a.split(" ")) {
			if(s.length()%2 ==0) {
				System.out.println(s);
			}
		}
		
	}
	

}
