
public class reverse4 {
	
	public static void main(String[] args) {
		//reverse a number with string builder
		
		int n=1234;
		String temp =""+ n;
		
		StringBuilder sb = new StringBuilder(temp);
		
		StringBuilder str= sb.reverse();
		
		System.out.println(str.toString());
	}

}
