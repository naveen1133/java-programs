package lambda;


import java.util.function.Predicate;

public class Predict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> even = n -> n%2 == 0;
		
System.out.println(even.test(56));

Predicate<String> uc = str -> str.isBlank();
Predicate<String> empty = str -> str.isEmpty();
System.out.println(uc.test("Divya"));
System.out.println(empty.test("Divya"));
	}

}
