package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortingNumbers {

	public static void main(String[] args) {
		
		List<Integer> a = Arrays.asList(11, 12, 11, 34, 12, 3, 5);
		
		List<Integer> l = a.stream().sorted().collect(Collectors.toList());
		System.out.println(l);

	}

}
