
public class palindrome3 {

	
	public static void main(String[] args) {
		//palindrome a number with string builder
		
		int n=123214;
		String temp =""+ n;
		
		StringBuilder sb = new StringBuilder(temp);
		
		StringBuilder str= sb.reverse();
		
		System.out.println(str.toString());
		
		if(temp.compareTo(str.toString()) == 0)
		{
			System.out.println("Palindrome = Yes");
		}
	        else
	            System.out.println("Palindrome = No");
		}
	}
