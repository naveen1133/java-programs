
public class fibonacci {

	public static void main(String[] args) {
		// fibonacci series
		
		int m=0 , n=1, sum;
		System.out.print(m + " "+n);
		
		for(int i=2; i<=5 ; i++)
		{
			sum=m+n;
			System.out.print(" "+sum);
			m=n;
			n=sum;
		}

	}

}
