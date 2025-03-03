
public class prime {

	public static void main(String[] args) {
		// prime numbers between m and n
		
		int m=2;
		int n=99;

		for(int i=m;i<=n;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			
			if(c==2)
			{
				System.out.print(i+ " ");
			}
		}

	}

}
