package streamAPI;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {13,12,10,8};
		int min = Arrays.stream(a).min().orElse(0);
		int max = Arrays.stream(a).max().orElse(0);
		 LinkedList<Integer> set = new LinkedList<>();
			
			for(int i=0;i<a.length;i++) {
				set.add(a[i]);
				
			}
			
			List<Integer> rem= IntStream.range(min, max).filter(num ->!set.contains(num)).boxed().collect(Collectors.toList());
			 System.out.println("Missing numbers: " + rem);
			 
			 int first= IntStream.range(min, max).filter(num ->!set.contains(num)).findFirst().orElse(-1);
			 
			 System.out.println("Missing numbers: " + first);
				
	}

}
