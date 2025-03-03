
public class reverse2 {

	public static void main(String[] args) {
		// reverse a number with 2nd logic in while loop
		
		int n=123;
		
		int rem , res=0;
		
		while(n>0) {
			rem=n%10; //reaminder we need to take
			res = res*10 + rem;
			n=n/10; // quotient we need to take
		}
		System.out.println(res);
	}

}
