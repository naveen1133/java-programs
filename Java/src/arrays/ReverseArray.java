package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};

		 ArrayList<Integer> b = new ArrayList<>();
		 
		 for(int i=a.length-1;i>=0;i--) {
			 b.add(a[i]);
		 }
		 System.out.println(b);
		 List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		 Collections.reverse(numbers);
		 System.out.println(numbers);
	}

}
