
public class armstrong {

	public static void main(String[] args) {
		// armstrong number
		
		int n=154;
		int temp=n;
		int res=0;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			res=res+(rem*rem*rem);
			n=n/10;
		}
if(temp==res)
{
	System.out.println(temp + "is aremstrong number");
}
else {
	System.out.println(temp + "is not aremstrong number");	
}
	}

}
