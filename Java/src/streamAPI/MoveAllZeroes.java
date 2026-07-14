package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MoveAllZeroes {

	public static void main(String[] args) {
		
		int [] a = {13,0,12,10,8,0,6,0,2,4,6};
		
		List<Integer> b=  IntStream.concat(Arrays.stream(a).filter(i -> i!=0), Arrays.stream(a).filter(i -> i==0)).boxed()
				.toList();
System.out.println(b);


	}

}
