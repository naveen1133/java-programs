package strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Naveen";
		String r="";
		for(int i=0;i<s.length(); i++) {
			char c=s.charAt(i);
			
			r=c+r;		}
		System.out.println(r);
		
		StringBuilder sb = new StringBuilder();

		sb.append(s);
		
		sb.reverse();
		
		System.out.println(sb);
		
		char[] c1= s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(c1[i]);
		}
		}

}
