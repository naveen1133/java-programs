
public class factorial {
	public static void main(String[] args) {
		int n=5;
		int f=1;
	//Increment order	
//		for(int i=1; i<=n; i++) {
//			
//			f=f*i;
//			
//		}
		
		// Decrement order
		
		for(int i=f ;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println(f);
	}

}
