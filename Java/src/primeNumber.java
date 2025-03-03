
public class primeNumber {

	public static void main(String[] args) {
		// checking prime number
		
		int n=5;
		int count=0;
		for (int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println("prime number");
		}
		
		else {
			System.out.println(" not prime number");
		}

	}

}
