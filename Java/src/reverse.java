
public class reverse {

	public static void main(String[] args) {
		// reverse a number with while loop 1st logic
		
		int n= 123;
		
		int res=0;
		
		while(n>0)
		{
			res=n%10;
			System.out.print(res);
			n=n/10;
		}

	}

}
