package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		List<Integer> distinctCount = numbers.stream()
		                            .distinct().collect(Collectors.toList());
		System.out.println(distinctCount); // Output: 5


	}

}
