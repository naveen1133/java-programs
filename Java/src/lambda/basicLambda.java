package lambda;

public class basicLambda {
	interface Greeting {
	    void sayHello();
	}
	
	interface Printer {
	    void print(String msg);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greeting s = () -> System.out.println("Hello");
		s.sayHello();
		
		  Printer p = msg -> System.out.println(msg);
	        p.print("Hello Lambda");
	}

}
