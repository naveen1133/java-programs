package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Johnson", "Jhon", "Bob", "Ball");
		
		List<Integer> numbers = Arrays.asList(1,3,0,4,2,9,5);
		
		Collections.sort(numbers);
		Collections.sort(names);
		
		System.out.println(numbers);
		
		System.out.println(names);

	}

}
