package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};

		 List<Integer> b = new ArrayList<>();
		 
		 for(int i=0;i<a.length;i++) {
			 b.add(a[i]);
			 
		 }
		 Collections.reverse(b);
		 System.out.println(b);
		 List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		 
		 //removing the duplicates by using the distinct method in stream
		 List<Integer> d = numbers.stream().distinct().collect(Collectors.toList());
//		 Collections.reverse(numbers);
		 System.out.println(d);
	}

}
