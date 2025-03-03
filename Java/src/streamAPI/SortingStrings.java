package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Johnson", "Jhon", "Bob", "Ball");
		
		List<String> sortingNames = names.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortingNames);

	}

}
